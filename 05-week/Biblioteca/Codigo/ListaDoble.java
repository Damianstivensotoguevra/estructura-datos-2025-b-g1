public class ListaDoble {
    private class Nodo {
        Operacion dato;
        Nodo siguiente, anterior;
        Nodo(Operacion dato) { this.dato = dato; }
    }

    private Nodo cabeza, cola;

    public void insertar(Operacion op) {
        Nodo nuevo = new Nodo(op);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void recorrerAdelante() {
        Nodo aux = cabeza;
        if (aux == null) {
            System.out.println(" Historial vacío.");
            return;
        }
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }

    public void recorrerAtras() {
        Nodo aux = cola;
        if (aux == null) {
            System.out.println(" Historial vacío.");
            return;
        }
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.anterior;
        }
    }
}
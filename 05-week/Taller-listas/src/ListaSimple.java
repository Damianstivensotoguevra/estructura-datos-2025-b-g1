public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    /*Insertar al inicio*/
    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    /*Insertar al final*/
    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        temp.siguiente = nuevo;
    }

    /*Insertar en posición específica*/
    public void insertarPosicion(int valor, int posicion) {
        if (posicion == 0) {
            insertarInicio(valor);
            return;
        }
        Nodo temp = cabeza;
        for (int i = 0; i < posicion - 1; i++) {
            if (temp == null) {
                System.out.println("Posición inválida");
                return;
            }
            temp = temp.siguiente;
        }
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = temp.siguiente;
        temp.siguiente = nuevo;
    }

    /*Mostrar lista*/
    public void mostrarLista() {
        Nodo temp = cabeza;{}
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");{
    }
}
}
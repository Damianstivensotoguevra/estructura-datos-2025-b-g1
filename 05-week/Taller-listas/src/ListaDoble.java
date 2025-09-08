/*ListaDoble.java */
public class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;

    public ListaDoble() {
        cabeza = null;
        cola = null;
    }

    /* Se Insertar al inicio*/ 
    public void insertarInicio(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    /*Se Insertar al final */
    public void insertarFinal(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    /* Se Insertar en cualquier posición*/
    public void insertarPosicion(int valor, int posicion) {
        NodoDoble nuevo = new NodoDoble(valor);

        if (posicion <= 0 || cabeza == null) {
            insertarInicio(valor);
            return;
        }

        NodoDoble temp = cabeza;
        int i = 0;

        while (temp.siguiente != null && i < posicion - 1) {
            temp = temp.siguiente;
            i++;
        }

        if (temp.siguiente == null) { /* insertar al final*/ 
            insertarFinal(valor);
            return;
        }

        /*Insertar en medio*/
        nuevo.siguiente = temp.siguiente;
        nuevo.anterior = temp;
        temp.siguiente.anterior = nuevo;
        temp.siguiente = nuevo;
    }

    /*Eliminar primer nodo*/
    public void eliminarInicio() {
        if (cabeza == null) return; // lista vacía
        if (cabeza == cola) {       // solo un nodo
            cabeza = cola = null;
        } else {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        }
    }

    /*Eliminar último nodo*/
    public void eliminarFinal() {
        if (cola == null) return; // lista vacía
        if (cabeza == cola) {     // solo un nodo
            cabeza = cola = null;
        } else {
            cola = cola.anterior;
            cola.siguiente = null;
        }
    }

    /*Eliminar en cualquier posición*/
    public void eliminarPosicion(int posicion) {
        if (cabeza == null) { // lista vacía
            System.out.println("Lista vacía");
            return;
        }

        if (posicion == 0) { /*eliminar inicio*/
            eliminarInicio();
            return;
        }

        NodoDoble temp = cabeza;
        int i = 0;

        while (temp.siguiente != null && i < posicion - 1) {
            temp = temp.siguiente;
            i++;
        }

        if (temp.siguiente == null) {
            System.out.println("Posición inválida");
            return;
        }

        if (temp.siguiente == cola) { /*eliminar final*/
            eliminarFinal();
            return;
        }

        /*eliminar nodo en medio*/
        NodoDoble aEliminar = temp.siguiente;
        temp.siguiente = aEliminar.siguiente;
        aEliminar.siguiente.anterior = temp;

        /*limpiar referencias del nodo eliminado*/
        aEliminar.siguiente = null;
        aEliminar.anterior = null;
    }

    /*Mostrar lista*/
    public void mostrarLista() {
        NodoDoble temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
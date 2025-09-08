public class ListaCircular {
    private NodoCircular cabeza;

    public ListaCircular() {
        cabeza = null;
    }

    /* Insertar al final*/
    public void insertarFinal(int valor) {
        NodoCircular nuevo = new NodoCircular(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            NodoCircular cola = cabeza.anterior;
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    /*Insertar en posición específica */ 
    public void insertarPosicion(int valor, int posicion) {
        if (cabeza == null || posicion <= 0) {
            NodoCircular nuevo = new NodoCircular(valor);
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            return;
        }

        NodoCircular temp = cabeza;
        int i = 0;

        do {
            if (i == posicion - 1) break;
            temp = temp.siguiente;
            i++;
        } while (temp != cabeza);

        NodoCircular nuevo = new NodoCircular(valor);
        nuevo.siguiente = temp.siguiente;
        nuevo.anterior = temp;
        temp.siguiente.anterior = nuevo;
        temp.siguiente = nuevo;
    }

    /*Eliminar en posición específica */
    public void eliminarPosicion(int posicion) {
        if (cabeza == null) return;

        NodoCircular temp = cabeza;
        int i = 0;

        // Si se elimina el primer nodo
        if (posicion == 0) {
            if (cabeza.siguiente == cabeza) {
                cabeza = null;
                return;
            }
            NodoCircular cola = cabeza.anterior;
            cabeza = cabeza.siguiente;
            cabeza.anterior = cola;
            cola.siguiente = cabeza;
            return;
        }

        /* Avanzar hasta el nodo anterior al que queremos eliminar*/ 
        while (i < posicion) {
            temp = temp.siguiente;
            i++;
            if (temp == cabeza) {
                System.out.println("Posición inválida");
                return;
            }
        }

        temp.anterior.siguiente = temp.siguiente;
        temp.siguiente.anterior = temp.anterior;
        temp.siguiente = null;
        temp.anterior = null;
    }

    /* Mostrar lista*/ 
    public void mostrarLista(int n) {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        NodoCircular temp = cabeza;
        int count = 0;
        do {
            System.out.print(temp.dato + " <-> ");
            temp = temp.siguiente;
            count++;
        } while (temp != cabeza && count < n); /*evita bucle infinito */
        System.out.println("...");
    }
}

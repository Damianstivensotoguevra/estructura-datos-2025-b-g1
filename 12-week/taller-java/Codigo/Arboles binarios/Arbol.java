public class Arbol{
    private Nodos raiz;

    /*Insertar valor (como árbol binario de búsqueda)*/
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodos insertarRec(Nodos actual, int valor) {
        if (actual == null)
            return new Nodos (valor);

        if (valor < actual.valor)
            actual.izquierdo = insertarRec(actual.izquierdo, valor);
        else if (valor > actual.valor)
            actual.derecho = insertarRec(actual.derecho, valor);
        else
            System.out.println(" El valor " + valor + " ya existe en el árbol.");

        return actual;
    }

    /** Recorrido Inorden: Izquierda - Raíz - Derecha */
    public void inOrden(Nodos nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    /** Recorrido Preorden: Raíz - Izquierda - Derecha */
    public void preOrden(Nodos nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    /*Recorrido Postorden: Izquierda - Derecha - Raí*/
    public void postOrden(Nodos nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    /*Mostrar recorridos */
    public void mostrarRecorridos() {
        System.out.print("\n🌿 InOrden: ");
        inOrden(raiz);
        System.out.print("\n🌱 PreOrden: ");
        preOrden(raiz);
        System.out.print("\n🍂 PostOrden: ");
        postOrden(raiz);
        System.out.println();
    }

    public Nodos getRaiz() {
        return raiz;
    }
}

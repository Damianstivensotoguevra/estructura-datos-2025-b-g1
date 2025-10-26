public class ArbolAVL {
    private NodoAVL raiz;

    /*Altura de un nodo */
    private int altura(NodoAVL n) {
        return (n == null) ? 0 : n.altura;
    }

    /*Factor de balance */
    private int factorBalance(NodoAVL n) {
        return (n == null) ? 0 : altura(n.izquierdo) - altura(n.derecho);
    }

    /* Rotación simple a la derecha (LL) */
    private NodoAVL rotarDerecha(NodoAVL y) {
        NodoAVL x = y.izquierdo;
        NodoAVL T2 = x.derecho;

        x.derecho = y;
        y.izquierdo = T2;

        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho)) + 1;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho)) + 1;

        System.out.println("🔄 Rotación Derecha (LL)");
        return x;
    }

    /*Rotación simple a la izquierda (RR) */
    private NodoAVL rotarIzquierda(NodoAVL x) {
        NodoAVL y = x.derecho;
        NodoAVL T2 = y.izquierdo;

        y.izquierdo = x;
        x.derecho = T2;

        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho)) + 1;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho)) + 1;

        System.out.println("🔄 Rotación Izquierda (RR)");
        return y;
    }

    /*Inserta un nodo y mantiene el equilibrio */
    private NodoAVL insertar(NodoAVL nodo, int valor) {
        if (nodo == null)
            return new NodoAVL(valor);

        if (valor < nodo.valor)
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = insertar(nodo.derecho, valor);
        else
            return nodo; // duplicado

        nodo.altura = 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
        int balance = factorBalance(nodo);

        /*Casos de rotación*/
        if (balance > 1 && valor < nodo.izquierdo.valor)
            return rotarDerecha(nodo); // LL
        if (balance < -1 && valor > nodo.derecho.valor)
            return rotarIzquierda(nodo); // RR
        if (balance > 1 && valor > nodo.izquierdo.valor) {
            System.out.println("🔁 Rotación Doble Izquierda-Derecha (LR)");
            nodo.izquierdo = rotarIzquierda(nodo.izquierdo);
            return rotarDerecha(nodo);
        }
        if (balance < -1 && valor < nodo.derecho.valor) {
            System.out.println("🔁 Rotación Doble Derecha-Izquierda (RL)");
            nodo.derecho = rotarDerecha(nodo.derecho);
            return rotarIzquierda(nodo);
        }

        return nodo;
    }

    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    /*Recorrido InOrden (izq - raíz - der) */
    private void inOrden(NodoAVL nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    public void mostrarInOrden() {
        System.out.print("\n🌿 InOrden: ");
        inOrden(raiz);
        System.out.println();
    }
}

public class NodoCircular {
    int dato;
    NodoCircular siguiente;/*Se Referencia al siguiente nodo en la lista circular */
    NodoCircular anterior;/*Se Referencia al siguiente nodo en la lista circular */
 /* Inicializa un nodo con el valor dado y punteros nulos.*/
    public NodoCircular(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}


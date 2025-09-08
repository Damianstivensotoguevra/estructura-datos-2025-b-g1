public class NodoDoble {
    int dato;/*  Valor almacenado en el nodo */
    NodoDoble siguiente;/* Se Referencia al siguiente nodo en la lista */
    NodoDoble anterior;/* Se Referencia al anterior nodo en la lista */
/* Referencia al siguiente nodo en la lista */
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
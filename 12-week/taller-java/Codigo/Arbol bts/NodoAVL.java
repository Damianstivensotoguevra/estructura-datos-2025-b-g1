public class NodoAVL {
    int valor;
    int altura;
    NodoAVL izquierdo, derecho;

    public NodoAVL(int valor) {
        this.valor = valor;
        this.altura = 1; // Altura inicial del nodo
    }
}

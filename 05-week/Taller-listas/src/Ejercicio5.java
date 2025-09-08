public class Ejercicio5 {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        /*valores iniciales */
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        System.out.println("Lista circular inicial:");
        lista.mostrarLista(10);

        lista.insertarPosicion(15, 1); /*insertar en medio*/
        lista.insertarPosicion(5, 0);  /* insertar al inicio*/
        System.out.println("Después de inserciones:");
        lista.mostrarLista(10);

        lista.eliminarPosicion(0); /*eliminar inicio*/
        lista.eliminarPosicion(2); /*eliminar medio/final*/

        System.out.println("Después de eliminaciones:");
        lista.mostrarLista(10);
    }
}

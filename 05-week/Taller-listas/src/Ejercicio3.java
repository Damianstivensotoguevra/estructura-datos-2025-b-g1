public class Ejercicio3{
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Lista original:");
        lista.mostrarLista();

        lista.eliminarPosicion(0); /*eliminar inicio */ 
        lista.eliminarPosicion(2); /*eliminar final */ 
        lista.eliminarPosicion(1); /*eliminar medio*/

        System.out.println("Lista después de las eliminaciones:");
        lista.mostrarLista();
    }
}
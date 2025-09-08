public class Ejercicio4 {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        /*Insertar elementos */
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Lista original:");
        lista.mostrarLista();  

        /*Eliminar primer nodo*/
        lista.eliminarInicio();
        System.out.println("Después de eliminar inicio:");
        lista.mostrarLista();  

        /*Eliminar último nodo*/
        lista.eliminarFinal();
        System.out.println("Después de eliminar final:");
        lista.mostrarLista(); 
    }
}

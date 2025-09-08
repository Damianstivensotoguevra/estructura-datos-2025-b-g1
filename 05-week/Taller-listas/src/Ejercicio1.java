public class Ejercicio1 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
 
        /* Insertar al inicio*/ 
        lista.insertarInicio(5);
        System.out.println(" insertar 5 al inicio , para distinguir el elemnto que esta inicialmente:");

        /*realizo la insercion de los ultimos elemntos*/
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

      /*puedo mostrar la lista actual con los ultimos elmentos insertados */
        System.out.println("Lista actual:");
        lista.mostrarLista();
     }   

}    
public class Ejercicio2 {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        
        /*los valores que ya estan para hacar la demostracion */
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        lista.insertarPosicion(5, 0);   /*Inicio */ 
        lista.insertarPosicion(15, 2);  /* Isertar en el medio */
        lista.insertarPosicion(35, 5);  /*Insertar al final  */

        /*Mostrar la lista  */
        lista.mostrarLista();
    }
}


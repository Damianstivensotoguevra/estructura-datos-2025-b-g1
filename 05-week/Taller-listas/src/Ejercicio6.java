public class Ejercicio6 {
    public static void main(String[] args) {
        ListaDoble cola = new ListaDoble();

        /*Llegan pacientes*/
        /*uso el hashCode para generar un numero de valor unico para manaejarlo por int y no string  */
        cola.insertarFinal("Juan".hashCode());
        cola.insertarFinal("María".hashCode());
        cola.insertarFinal("Carlos".hashCode());

        System.out.println("Cola inicial:");
        cola.mostrarLista();

        /*Llega un paciente con urgencia y se inserta en el medio*/
        cola.insertarPosicion("Ana".hashCode(), 1);

        System.out.println("Después de insertar paciente urgente:");
        cola.mostrarLista();

        /*Se atiende el primer paciente */ 
        cola.eliminarInicio();
        System.out.println("Después de atender al primer paciente:");
        cola.mostrarLista();

        /*Paciente que se retira antes de ser atendido (posición 1) */ 
        cola.eliminarPosicion(1);
        System.out.println("Después de retiro de paciente en medio:");
        cola.mostrarLista();
    }
}

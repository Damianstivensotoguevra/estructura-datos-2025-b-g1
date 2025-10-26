package Codigo.colas;

import java.util.PriorityQueue;
public class sistemadeatencion {
    private PriorityQueue<cliente> colaPrioridad;

    public sistemadeatencion() {
        colaPrioridad = new PriorityQueue<>();
    }

    /*Agregar un cliente a la cola */
    public void agregarCliente(cliente cliente) {
        colaPrioridad.add(cliente);
        System.out.println("✅ Cliente agregado: " + cliente);
    }

    /*Atender al siguiente cliente */
    public void atenderCliente() {
        if (colaPrioridad.isEmpty()) {
            System.out.println("No hay clientes en la cola.");
        } else {
            cliente atendido = colaPrioridad.poll();
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    /*Mostrar todos los clientes en la cola (sin atender) */
    public void mostrarCola() {
        if (colaPrioridad.isEmpty()) {
            System.out.println("No hay clientes esperando.");
        } else {
            System.out.println("Clientes en espera:");
            colaPrioridad.forEach(System.out::println);
        }
    }

    /*Verificar si hay clientes pendientes */
    public boolean hayClientes() {
        return !colaPrioridad.isEmpty();
    }
}

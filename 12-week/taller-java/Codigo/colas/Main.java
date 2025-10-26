package Codigo.colas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sistemadeatencion sistema = new sistemadeatencion();

        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE ATENCIÓN =====");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender siguiente");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); /*limpiar buffer*/

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Prioridad (1=Alta, 2=Media, 3=Baja): ");
                    int prioridad = sc.nextInt();
                    sistema.agregarCliente(new cliente(nombre, prioridad));
                }
                case 2 -> sistema.atenderCliente();
                case 3 -> sistema.mostrarCola();
                case 4 -> System.out.println("👋 Saliendo del sistema...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

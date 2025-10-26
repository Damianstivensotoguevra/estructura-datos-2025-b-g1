package Codigo.Tablas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestorusuario gestor = new Gestorusuario();

        int opcion;
        do {
            System.out.println("\n===== SISTEMA DE USUARIOS (HashMap) =====");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Buscar usuario por ID");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Mostrar todos los usuarios");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); /*limpiar buffer*/

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese ID del usuario: ");
                    String id = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    gestor.agregarUsuario(new Usuario(id, nombre));
                }
                case 2 -> {
                    System.out.print("Ingrese el ID a buscar: ");
                    String id = sc.nextLine();
                    gestor.buscarUsuario(id);
                }
                case 3 -> {
                    System.out.print("Ingrese el ID a eliminar: ");
                    String id = sc.nextLine();
                    gestor.eliminarUsuario(id);
                }
                case 4 -> gestor.mostrarUsuarios();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}

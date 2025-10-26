package Codigo.pila;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        editordetext editor = new editordetext(); /*creamos un objeto editor*/

        int opcion;
        do {
            System.out.println("\n=EDITOR DE TEXTO =");
            System.out.println("Texto actual: " + editor.obtenerTexto());
            System.out.println("1. Escribir texto");
            System.out.println("2. Borrar caracteres");
            System.out.println("3. Deshacer");
            System.out.println("4. Rehacer");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); /*limpiar buffer*/

            switch (opcion) {
                case 1:
                    System.out.print("Texto a escribir: ");
                    String nuevo = sc.nextLine();
                    editor.escribir(nuevo);
                    break;
                case 2:
                    System.out.print("Cantidad de caracteres a borrar: ");
                    int n = sc.nextInt();
                    editor.borrar(n);
                    break;
                case 3:
                    editor.deshacer();
                    break;
                case 4:
                    editor.rehacer();
                    break;
                case 5:
                    System.out.println("Saliendo del editor...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();

        int opcion;
        do {
            System.out.println("\n= ÁRBOL BINARIO =");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Mostrar recorridos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese valor a insertar: ");
                    int valor = sc.nextInt();
                    arbol.insertar(valor);
                }
                case 2 -> arbol.mostrarRecorridos();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}

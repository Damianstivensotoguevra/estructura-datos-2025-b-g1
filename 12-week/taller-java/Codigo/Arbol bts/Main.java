import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolAVL arbol = new ArbolAVL();

        int opcion;
        do {
            System.out.println("\n===== ÁRBOL AVL =====");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Mostrar recorrido InOrden");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Valor a insertar: ");
                    int valor = sc.nextInt();
                    arbol.insertar(valor);
                }
                case 2 -> arbol.mostrarInOrden();
                case 3 -> System.out.println("👋 Saliendo...");
                default -> System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}

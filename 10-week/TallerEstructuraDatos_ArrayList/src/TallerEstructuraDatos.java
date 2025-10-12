import java.util.Scanner;

public class TallerEstructuraDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda tienda = new Tienda();  /*ahora usamos la clase Tienda */ 
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE TECHMARKET ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar categorías");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
                System.out.print("Seleccione una opción: ");
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();

                    // Mostrar categorías disponibles
                    System.out.println("\nCategorías disponibles:");
                    String[] cats = tienda.getCategorias();
                    for (int i = 0; i < cats.length; i++) {
                        System.out.println((i + 1) + ". " + cats[i]);
                    }

                    System.out.print("Seleccione el número de la categoría: ");
                    int catIndex = sc.nextInt();
                    sc.nextLine();

                    String categoria;
                    if (catIndex >= 1 && catIndex <= cats.length) {
                        categoria = cats[catIndex - 1];
                    } else {
                        System.out.println("Categoría no válida. Se asignará 'Sin categoría'.");
                        categoria = "Sin categoría";
                    }

                    System.out.print("Ingrese el precio del producto: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    if (!nombre.isEmpty() && precio > 0) {
                        Producto p = new Producto(nombre, categoria, precio);
                        tienda.agregarProducto(p);
                        System.out.println("Producto agregado correctamente.");
                    } else {
                        System.out.println(" El nombre o el precio no son válidos.");
                    }
                }

                case 2 -> tienda.listarProductos();

                case 3 -> {
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (tienda.eliminarProducto(eliminar)) {
                        System.out.println(" Producto eliminado con éxito.");
                    } else {
                        System.out.println(" El producto no existe en la lista.");
                    }
                }

                case 4 -> tienda.mostrarCategorias();

                case 0 -> System.out.println(" Saliendo del sistema...");

                default -> System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

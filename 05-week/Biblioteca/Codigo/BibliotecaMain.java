import java.util.Scanner;

public class BibliotecaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("\n=== MENÚ BIBLIOTECA ===");
            System.out.println("1. Alta de libro");
            System.out.println("2. Baja de libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Listar catálogo");
            System.out.println("7. Listar préstamos activos");
            System.out.println("8. Ver historial adelante");
            System.out.println("9. Ver historial atrás");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Stock inicial: ");
                    int stock = sc.nextInt();
                    sc.nextLine();

                    biblioteca.altaLibro(codigo, titulo, autor, stock);
                }
                case 2 -> {
                    System.out.print("Código del libro a dar de baja: ");
                    int codigoBaja = sc.nextInt();
                    sc.nextLine();
                    biblioteca.bajaLibro(codigoBaja);
                }
                case 3 -> {
                    System.out.print("Ingrese título, autor o código a buscar: ");
                    String texto = sc.nextLine();
                    biblioteca.buscarLibro(texto);
                }
                case 4 -> {
                    System.out.print("Código del libro a prestar: ");
                    int codPrestamo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del usuario: ");
                    String usuario = sc.nextLine();
                    biblioteca.prestarLibro(codPrestamo, usuario);
                }
                case 5 -> {
                    System.out.print("Código del libro a devolver: ");
                    int codDevolver = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del usuario: ");
                    String usuarioDevolver = sc.nextLine();
                    biblioteca.devolverLibro(codDevolver, usuarioDevolver);
                }
                case 6 -> biblioteca.listarCatalogo();
                case 7 -> biblioteca.listarPrestamos();
                case 8 -> biblioteca.historialAdelante();
                case 9 -> biblioteca.historialAtras();
                case 0 -> System.out.println(" Saliendo...");
                default -> System.out.println(" Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}


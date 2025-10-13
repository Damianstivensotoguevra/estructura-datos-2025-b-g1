import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashTable<String, String> usuarios = new HashTable<>(10);
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n1. Agregar\n2. Consultar\n3. Eliminar\n4. Mostrar\n0. Salir");
            op = sc.nextInt(); sc.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.print("Usuario: "); String u = sc.nextLine();
                    System.out.print("Rol: "); String r = sc.nextLine();
                    usuarios.put(u, r);
                }
                case 2 -> {
                    System.out.print("Usuario a consultar: ");
                    String u = sc.nextLine();
                    System.out.println("Rol: " + usuarios.get(u));
                }
                case 3 -> {
                    System.out.print("Usuario a eliminar: ");
                    String u = sc.nextLine();
                    usuarios.remove(u);
                }
                case 4 -> System.out.println("Total usuarios: " + usuarios.size());
            }
        } while (op != 0);
        sc.close();
    }
}

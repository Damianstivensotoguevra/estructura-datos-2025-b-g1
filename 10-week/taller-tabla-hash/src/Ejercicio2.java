import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashTable<String, Integer> contador = new HashTable<>(20);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine().toLowerCase();

        /*Separar las palabras usando regex (solo letras/números)*/
        String[] palabras = texto.split("\\W+");

        /*Contar ocurrencias*/
        for (String palabra : palabras) {
            if (palabra.isEmpty()) continue;

            Integer valorActual = contador.get(palabra);
            if (valorActual == null) {
                contador.put(palabra, 1);
            } else {
                contador.put(palabra, valorActual + 1);
            }
        }

        /*Mostrar resultados*/
        System.out.println("\nConteo de palabras:");
        for (String palabra : palabras) {
            Integer conteo = contador.get(palabra);
            if (conteo != null) {
                System.out.println(palabra + " → " + conteo);
                contador.remove(palabra); // Evita mostrar repetidas
            }
        }

        sc.close();
    }
}

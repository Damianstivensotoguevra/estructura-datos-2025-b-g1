public class Ejercicio4 {
    public static void main(String[] args) {
        HashTable<Integer, String> tabla = new HashTable<>(10);

        for (int i = 1; i <= 15; i++) {
            tabla.put(i, "Valor " + i);
        }

        System.out.println("Se insertaron 15 elementos en una tabla de 10 cubetas.");
        System.out.println("Tamaño actual: " + tabla.size());
        
        /*Prueba de eliminación*/
        tabla.remove(10);
        System.out.println("\nDespués de eliminar la clave 10:");
        System.out.println("Tamaño actual: " + tabla.size());
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        HashTable<String, Integer> tabla = new HashTable<>(5); /* pequeña para forzar colisiones*/

        /*Estas claves tienen alta probabilidad de colisionar en tablas pequeñas*/
        tabla.put("Aa", 1);
        tabla.put("BB", 2);
        tabla.put("AaAa", 3);
        tabla.put("BBBB", 4);

        System.out.println("Se insertaron claves que colisionan:");
        System.out.println("Aa : " + tabla.get("Aa"));
        System.out.println("BB : " + tabla.get("BB"));
        System.out.println("AaAa : " + tabla.get("AaAa"));
        System.out.println("BBBB : " + tabla.get("BBBB"));

        System.out.println("\nTamaño total: " + tabla.size());
    }
}

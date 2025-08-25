/*Clase principal*/
public class Ejercicio2_RLE {
    public static String compressRLE(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        /*Recorremos desde el segundo carácter*/
        for (int i = 1; i < text.length(); i++) {
            char prev = text.charAt(i - 1);
            char current = text.charAt(i);

            if (current == prev) {
                count++; /*mismo caracter incrementar contador */
            } else {
        /* si es distinto guardar el bloque anterior*/
                sb.append(prev).append(count);
                count = 1; /*reiniciar contador*/
            }
        }
        /* Se agregar el último bloque */
        sb.append(text.charAt(text.length() - 1)).append(count);
        return sb.toString();
    }
         /* Calcula el ratio de compresión */
    public static double compressionRatio(String original, String compressed) {
        if (original == null || original.length() == 0) {
            return 0.0; /*se evita la división por cero*/
        }

        return (double) compressed.length() / original.length();
    }
    /*  */
    public static void main(String[] args) {
        String input = "aaabbccccd"; 
        String compressed = compressRLE(input);2
        double ratio = compressionRatio(input, compressed);
        System.out.println("Texto original: " + input);
        System.out.println("Texto comprimido (RLE): " + compressed);
        System.out.println("Longitud original: " + input.length());
        System.out.println("Longitud comprimida: " + compressed.length());
        System.out.println("Ratio de compresión: " + ratio);
    }
}
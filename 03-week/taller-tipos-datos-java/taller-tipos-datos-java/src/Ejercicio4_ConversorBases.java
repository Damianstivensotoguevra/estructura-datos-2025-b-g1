/*se usa para no tener limitaciones de valores  */
import java.math.BigInteger;
public class Ejercicio4_ConversorBases{
    public static void main(String[] args) {
        /*número y base de origen*/
        String numero = "7FFFFFFFFFFFFFFF"; /*esta en hexadecimal  y máximo long*/
        int baseOrigen = 16; /* se toma 16 d base origen*/

        /*se normaliza */
        numero = numero.trim().toUpperCase();

        boolean usoBigInteger = false;
        BigInteger bigValor;
        long valorLong = 0;

        try {
            /*se Intenta parsear como long*/
            valorLong = Long.parseLong(numero, baseOrigen);
            bigValor = BigInteger.valueOf(valorLong);
        } catch (Exception e) {
            /* Si no cabe en long, usar BigInteger*/
            usoBigInteger = true;
            bigValor = new BigInteger(numero, baseOrigen);
        }

        /* se hace Convertir a otras bases */
        String enDecimal = bigValor.toString(10);
        String enBinario = bigValor.toString(2);
        String enHex = bigValor.toString(16).toUpperCase();

        /*se imprime los resultaos */
        System.out.println("Número de entrada: " + numero + " (base " + baseOrigen + ")");
        System.out.println("Decimal: " + enDecimal);
        System.out.println("Binario: " + enBinario);
        System.out.println("Hexadecimal: " + enHex);
        System.out.println("¿Se usó BigInteger?: " + usoBigInteger);
    }
}
public class Ejercicio3_Temperaturas {
    public static void main(String[] args) {
        /* prueba del string recibic*/
        String datos = "23.4,21.8,22.1,24.0,20.5";

        /* se Separa con split y se convierte  a double */
        String[] partes = datos.split(",");
        double[] temperaturas = new double[partes.length];
        
        for (int i = 0; i < partes.length; i++) {
            temperaturas[i] = Double.parseDouble(partes[i].trim()); /*se usa el trim para quitar espacios*/
        }
        /*Recorrer para obtener min, max y suma*/
        double min = temperaturas[0];
        double max = temperaturas[0]
        double suma = 0.0;

        for (double t : temperaturas) {
            if (t < min) min = t;
            if (t > max) max = t;
            suma += t;
        }

        /*se realiza calculo del promedio */
        double promedio = suma / temperaturas.length;

        /*Calcular varianza y desviación estándar*/
        double varianza = 0.0;
        for (double t : temperaturas) {
            varianza += Math.pow(t - promedio, 2);
        }
        varianza /= temperaturas.length;
        double desviacion = Math.sqrt(varianza);

        /*donde se imprime para mostrar los resultados de la prueba */
        System.out.println("Temperaturas: " + datos);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Promedio: " + promedio);
        System.out.println("Desviación estándar: " + desviacion);
    }
}
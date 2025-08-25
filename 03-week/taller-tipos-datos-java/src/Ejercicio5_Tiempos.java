import java.util.*;

public class Ejercicio5_Tiempos{
    public static void main(String[] args) {
        String[] tiempos = {"00:05:33", "00:12:17", "00:03:50"};

        long totalSegundos = 0;
        long[] enSegundos = new long[tiempos.length];

        /*se Parsea cada tiempo*/
        for (int i = 0; i < tiempos.length; i++) {
            String[] partes = tiempos[i].split(":");
            int h = Integer.parseInt(partes[0]);
            int m = Integer.parseInt(partes[1]);
            int s = Integer.parseInt(partes[2]);
            enSegundos[i] = h * 3600 + m * 60 + s;
            totalSegundos += enSegundos[i];
        }

        /* se saca el Promedio*/
        double promedioSegundos = (double) totalSegundos / tiempos.length;

        /*se consigue el Tramo más largo*/
        long max = enSegundos[0];
        int idxMax = 0;
        for (int i = 1; i < enSegundos.length; i++) {
            if (enSegundos[i] > max) {
                max = enSegundos[i];
                idxMax = i;
            }
        }

        /* se imprime los resultados */
        System.out.println("Tiempo total: " + formatear(totalSegundos));
        System.out.println("Promedio: " + formatear((long) promedioSegundos));
        System.out.println("Tramo más largo: " + tiempos[idxMax]);

        System.out.println("Porcentajes:");
        for (int i = 0; i < enSegundos.length; i++) {
            double porcentaje = (enSegundos[i] / (double) totalSegundos) * 100;
            porcentaje = Math.round(porcentaje * 100.0) / 100.0; // redondeo
            System.out.println(tiempos[i] + " -> " + porcentaje + "%");
        }
    }

    /* se usa un  método para convertir segundos a HH:MM:SS*/
    private static String formatear(long segundos) {
        long h = segundos / 3600;
        long m = (segundos % 3600) / 60;
        long s = segundos % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
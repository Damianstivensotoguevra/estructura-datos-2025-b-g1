package Codigo.colas;
public class cliente implements Comparable<cliente> {
    private String nombre;
    private int prioridad; /*1 = alta, 2 = media, 3 = baja*/

    public cliente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    /*Método para comparar prioridades */
    @Override
    public int compareTo(cliente otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        String nivel = switch (prioridad) {
            case 1 -> "Alta";
            case 2 -> "Media";
            default -> "Baja";
        };
        return nombre + " (Prioridad: " + nivel + ")";
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Graph mapa = new Graph();

        mapa.addEdge("Bogotá", "Medellín");
        mapa.addEdge("Bogotá", "Cali");
        mapa.addEdge("Medellín", "Barranquilla");
        mapa.addEdge("Cali", "Pasto");

        System.out.println("Recorrido BFS desde Bogotá:");
        System.out.println(mapa.bfs("Bogotá"));
    }
}

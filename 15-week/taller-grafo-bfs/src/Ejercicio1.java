public class Ejercicio1 {
    public static void main(String[] args) {
        Graph red = new Graph();

        red.addEdge("Ana", "Luis");
        red.addEdge("Ana", "Pedro");
        red.addEdge("Luis", "Carla");
        red.addEdge("Pedro", "Marta");

        System.out.println("Recorrido BFS desde Ana:");
        System.out.println(red.bfs("Ana")); 
    }
}

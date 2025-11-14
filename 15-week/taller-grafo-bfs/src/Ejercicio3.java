public class Ejercicio3 {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge("A", "B");
        g.addEdge("B", "C");
        g.addEdge("X", "Y");

        System.out.println("Recorrido BFS desde A:");
        System.out.println(g.bfs("A")); 

        System.out.println("Recorrido BFS desde X:");
        System.out.println(g.bfs("X"));
    }
}

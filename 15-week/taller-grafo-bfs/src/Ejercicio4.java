public class Ejercicio4 {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "E");

        System.out.println("Recorrido BFS desde A:");
        System.out.println(g.bfs("A")); 

        System.out.println("Recorrido DFS desde A:");
        System.out.println(g.dfs("A")); 
    }
}

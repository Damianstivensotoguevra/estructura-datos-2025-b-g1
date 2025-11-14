import java.util.*;

class Graph {

    private final Map<String, List<String>> adj = new HashMap<>();

    public void addVertex(String v) {
        adj.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(String v1, String v2) {
        adj.putIfAbsent(v1, new ArrayList<>());
        adj.putIfAbsent(v2, new ArrayList<>());
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    public List<String> bfs(String start) {
        List<String> order = new ArrayList<>();
        if (!adj.containsKey(start)) return order;

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            order.add(current);
            for (String neighbor : adj.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return order;



        
    }

    public List<String> dfs(String start) {
    List<String> order = new ArrayList<>();
    Set<String> visited = new HashSet<>();
    dfsHelper(start, visited, order);
    return order;
}

private void dfsHelper(String node, Set<String> visited, List<String> order) {
    if (!adj.containsKey(node) || visited.contains(node)) return;
    visited.add(node);
    order.add(node);
    for (String neighbor : adj.get(node)) {
        dfsHelper(neighbor, visited, order);
    }
}




}

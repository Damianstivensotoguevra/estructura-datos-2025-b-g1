package Codigo.Grafos;

import java.util.*;
public class Grafo {
    private Map<String, Nodo> nodos = new HashMap<>();

    /*Agrega una ciudad (nodo) */
    public void agregarNodo(String nombre) {
        nodos.put(nombre, new Nodo(nombre));
    }

    /*Crea una conexión entre dos nodos con un peso (distancia) */
    public void conectar(String origen, String destino, int peso) {
        Nodo nodoOrigen = nodos.get(origen);
        Nodo nodoDestino = nodos.get(destino);

        if (nodoOrigen != null && nodoDestino != null) {
            nodoOrigen.conectar(nodoDestino, peso);
            nodoDestino.conectar(nodoOrigen, peso); /*conexión bidireccional*/
        }
    }

    /*Algoritmo de Dijkstra: ruta más corta entre dos nodos */
    public void dijkstra(String inicio, String fin) {
        Nodo nodoInicio = nodos.get(inicio);
        Nodo nodoFin = nodos.get(fin);

        if (nodoInicio == null || nodoFin == null) {
            System.out.println("❌ Nodo no encontrado.");
            return;
        }

        Map<Nodo, Integer> distancias = new HashMap<>();
        Map<Nodo, Nodo> previos = new HashMap<>();
        PriorityQueue<Nodo> cola = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        /*Inicializar distancias*/
        for (Nodo n : nodos.values()) distancias.put(n, Integer.MAX_VALUE);
        distancias.put(nodoInicio, 0);
        cola.add(nodoInicio);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();

            for (Map.Entry<Nodo, Integer> vecino : actual.vecinos.entrySet()) {
                int nuevaDistancia = distancias.get(actual) + vecino.getValue();
                if (nuevaDistancia < distancias.get(vecino.getKey())) {
                    distancias.put(vecino.getKey(), nuevaDistancia);
                    previos.put(vecino.getKey(), actual);
                    cola.add(vecino.getKey());
                }
            }
        }

        /*Mostrar resultado*/
        if (distancias.get(nodoFin) == Integer.MAX_VALUE) {
            System.out.println("⚠️ No hay ruta entre " + inicio + " y " + fin);
        } else {
            System.out.println("✅ Distancia mínima de " + inicio + " a " + fin + ": " + distancias.get(nodoFin));
            List<Nodo> camino = new ArrayList<>();
            for (Nodo n = nodoFin; n != null; n = previos.get(n)) camino.add(n);
            Collections.reverse(camino);
            System.out.println("🛣️ Ruta: " + camino);
        }
    }

    /*Muestra todas las conexiones */
    public void mostrar() {
        System.out.println("\n🌐 GRAFO DE CIUDADES:");
        for (Nodo n : nodos.values()) {
            System.out.print(n + " -> ");
            n.vecinos.forEach((dest, peso) -> System.out.print(dest + "(" + peso + ") "));
            System.out.println();
        }
    }
}


---

##  **COMPLEJIDAD.md**

```markdown
# Análisis de Complejidad — BFS

###  Idea general
El algoritmo **BFS (Breadth-First Search)** recorre el grafo **nivel por nivel**, usando una cola para gestionar los nodos pendientes.  
Cada vértice y cada arista se procesan **exactamente una vez**.

---

### 📈 Complejidad temporal

| Operación | Descripción | Complejidad |
|------------|--------------|-------------|
| `addVertex` | Agrega un nodo al grafo | **O(1)** |
| `addEdge` | Crea una conexión (arista) entre dos nodos | **O(1)** |
| `bfs(start)` | Recorre el grafo completo desde un nodo inicial | **O(V + E)** |

**Donde:**
- `V` = número de vértices (nodos)
- `E` = número de aristas (conexiones)

BFS recorre cada nodo y arista una sola vez, por lo que su rendimiento crece de forma **lineal con respecto al tamaño del grafo**.

---

### Complejidad espacial

| Recurso | Uso | Complejidad |
|----------|-----|-------------|
| Cola (Queue) | Almacena nodos pendientes de visitar | O(V) |
| Conjunto `visited` | Guarda los nodos visitados | O(V) |
| Lista `order` | Guarda el orden del recorrido | O(V) |

Total: **O(V + E)** de espacio.

---

### Ejemplo práctico

Un grafo con 6 nodos y 7 aristas →  
Pasos totales ≈ V + E = 6 + 7 = **13 pasos**

Esto confirma que BFS es un algoritmo **eficiente y predecible** para recorrer grafos.

---

###  Conclusión

El BFS se comporta de manera lineal respecto al tamaño del grafo.  
Su complejidad **O(V + E)** garantiza eficiencia tanto en redes pequeñas como en estructuras grandes.

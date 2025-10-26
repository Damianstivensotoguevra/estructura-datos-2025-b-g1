# ⏱️ TEMA 8 — Complejidad Algorítmica (Big O)

---

## 🧠 1. Concepto

La **complejidad algorítmica** mide el rendimiento de un algoritmo,  
es decir, cómo crece su **tiempo de ejecución** o el **uso de memoria**  
según la cantidad de datos que procesa (**n**).

Se utiliza la **notación Big O (O-grande)** para expresar el **peor caso posible**,  
indicando qué tan rápido o lento crece el tiempo del algoritmo  
a medida que aumentan los datos de entrada.

---

## ⏱️ 2. Tipos de complejidad comunes

| Notación | Nombre | Ejemplo | Descripción |
|-----------|---------|----------|--------------|
| **O(1)** | Constante | Acceder al primer elemento de un arreglo | No cambia con el tamaño de los datos |
| **O(log n)** | Logarítmica | Búsqueda binaria | Divide el conjunto de datos a la mitad cada vez |
| **O(n)** | Lineal | Recorrer un arreglo | Aumenta proporcionalmente al tamaño del conjunto |
| **O(n log n)** | Lineal-logarítmica | MergeSort / QuickSort | Algo más lenta que la lineal, pero eficiente |
| **O(n²)** | Cuadrática | Doble bucle anidado | Mucho más lenta al crecer los datos |
| **O(2ⁿ)** | Exponencial | Fibonacci recursivo | Crece extremadamente rápido |
| **O(n!)** | Factorial | Permutaciones | Inviable para grandes conjuntos |

---

## 💻 3. Análisis de las estructuras implementadas en el taller

| Estructura | Operación | Complejidad | Explicación |
|-------------|------------|--------------|--------------|
| **Pila (Stack)** | push() / pop() | O(1) | Inserta o saca el último elemento en tiempo constante |
| **Cola (Queue)** | enqueue() / dequeue() | O(1) | Agrega y retira elementos al inicio/fin sin recorrer toda la lista |
| **HashMap** | insertar() / buscar() | O(1) promedio | Acceso directo usando una clave (hash) |
| **Árbol Binario** | insertar() / buscar() | O(log n) | Divide los datos en mitades, búsqueda más rápida |
| **Árbol AVL** | insertar() / eliminar() | O(log n) | Se equilibra automáticamente, mantiene baja altura |
| **Grafo (Dijkstra)** | ruta más corta | O(V²) o O(E log V) | Depende del número de vértices (V) y aristas (E) |

---

## 📊 4. Comparación visual

| Complejidad | Ejemplo de estructura | Eficiencia |
|--------------|------------------------|-------------|
| **O(1)** | Pila, Cola, HashMap | ⚡ Muy rápida |
| **O(log n)** | Árbol Binario, AVL | ✅ Eficiente |
| **O(n)** | Recorridos lineales | 🕐 Aceptable |
| **O(n²)** | Grafos grandes, bucles anidados | 🐢 Lenta |
| **O(2ⁿ)** | Recursión sin optimizar | 🚫 Muy lenta |

---

## 🔍 5. Ejemplo práctico (opcional)

```java
// Diferentes niveles de complejidad

// O(1)
int primerElemento = arreglo[0];

// O(n)
for (int i = 0; i < arreglo.length; i++) {
    System.out.println(arreglo[i]);
}

// O(n²)
for (int i = 0; i < arreglo.length; i++) {
    for (int j = 0; j < arreglo.length; j++) {
        System.out.println("(" + arreglo[i] + ", " + arreglo[j] + ")");
    }
}

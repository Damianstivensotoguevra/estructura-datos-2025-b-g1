# Taller — Implementación básica de una Tabla Hash

## Unidad 2 — Estructuras de Datos

### Propósito
Implementar una **tabla hash genérica en Java**, entendiendo:
- Qué es una función de dispersión (`hash`).
- Cómo se manejan las **colisiones con encadenamiento**.
- Cómo realizar operaciones básicas de inserción, búsqueda y eliminación.

---

## Estructura del proyecto

taller-tabla-hash/
├─ src/
│ ├─ Entry.java
│ ├─ HashTable.java
│ ├─ Ejercicio1.java
│ ├─ Ejercicio2.java
│ ├─ Ejercicio3.java
│ └─ Ejercicio4.java
├─ README.md
├─ COMPLEJIDAD.md
└─ evidencias/


---

##  Descripción de las clases principales

### **`Entry<K, V>`**
Representa un nodo dentro de la tabla hash:
- Guarda una `key`, un `value` y una referencia al siguiente nodo (`next`).
- Se usa para **resolver colisiones** mediante listas enlazadas.

### **`HashTable<K, V>`**
Implementa las operaciones básicas:
- `put(K key, V value)` — Inserta o actualiza un valor.  
- `get(K key)` — Busca el valor asociado a una clave.  
- `remove(K key)` — Elimina una clave y devuelve su valor.  
- `containsKey(K key)` — Verifica si la clave existe.  
- `size()` — Devuelve el número de elementos.  
- `isEmpty()` — Indica si la tabla está vacía.

Las colisiones se manejan con **encadenamiento** (listas enlazadas).

---

## Ejercicios realizados

### Ejercicio 1 — Diccionario usuario → rol
Permite agregar, consultar y eliminar usuarios con sus roles.

### Ejercicio 2 — Contador de palabras
Lee un texto y cuenta cuántas veces aparece cada palabra.

###  Ejercicio 3 — Colisiones controladas
Inserta claves diseñadas para producir el mismo índice y verifica que la tabla mantiene correctamente cada par.

### Ejercicio 4 — Prueba de tamaño
Inserta varios elementos y muestra el número total (`size()`), probando la eficiencia del hash.

---

## Ejemplo de uso básico
```java
HashTable<String, Integer> tabla = new HashTable<>(10);
tabla.put("uno", 1);
tabla.put("dos", 2);
System.out.println(tabla.get("uno")); // 1
tabla.remove("dos");
System.out.println(tabla.size()); // 1


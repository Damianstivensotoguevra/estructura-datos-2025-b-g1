# Complejidad de operaciones en listas

| Operación                | Lista simple | Lista doble |
|---------------------------|-------------|------------|
| Insertar al inicio        | O(1)        | O(1)       |
| Insertar al final         | O(n)        | O(1)*      |
| Insertar en posición      | O(n)        | O(n)       |
| Eliminar del inicio       | O(1)        | O(1)       |
| Eliminar del final        | O(n)        | O(1)*      |
| Eliminar en posición      | O(n)        | O(n)       |

\*Si se mantiene un puntero al último nodo (cola).

## Explicación

- **O(1) (Constante):** La operación se realiza en un solo paso, independientemente del tamaño de la lista.
- **O(n) (Lineal):** La operación requiere recorrer la lista hasta el nodo deseado, por lo que depende del tamaño de la lista.
- Las listas dobles permiten acceso directo al final si se mantiene un puntero a la cola, reduciendo el costo de algunas operaciones.
- En listas circulares, la complejidad de las operaciones es similar a las listas dobles, pero con la particularidad de mantener la conexión entre el primer y último nodo.
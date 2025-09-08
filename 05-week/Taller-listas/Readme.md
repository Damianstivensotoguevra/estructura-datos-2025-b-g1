# Taller de Listas Enlazadas

## Descripción General

Este taller tiene como objetivo implementar y comprender a profundidad las operaciones de inserción y eliminación en listas enlazadas: **simples, dobles y circulares**. Se busca reforzar la manipulación de nodos en memoria dinámica y analizar la complejidad de cada operación.

Se realizaron los siguientes ejercicios:

1. **Lista básica (Ejercicio 1)**
   - Implementa una lista simple que permite insertar elementos al final y mostrar la lista.
   - Se utilizó la clase `ListaSimple` y `Nodo`.

2. **Inserción múltiple (Ejercicio 2)**
   - Modificación de la lista doble para permitir insertar en cualquier posición.
   - Se utilizó la clase `ListaDoble` y `NodoDoble`.

3. **Eliminación controlada (Ejercicio 3)**
   - Agrega la operación para eliminar un nodo en una posición específica, con control de errores.
   - Se utilizó la clase `ListaDoble`.

4. **Lista doblemente enlazada (Ejercicio 4)**
   - Implementación de lista doble con punteros a anterior y siguiente.
   - Se probó la eliminación en ambos extremos.

5. **Lista circular (Ejercicio 5)**
   - Conversión de la lista en circular.
   - Inserción y eliminación de nodos en medio de la lista manteniendo la circularidad.
   - Se utilizó la clase `ListaCircular` y `NodoCircular`.

6. **Caso práctico aplicado (Ejercicio 6)**
   - Simulación de una lista de espera para un consultorio médico donde los pacientes ingresan y salen de la cola en tiempo real.
   - Se utiliza la clase `ListaDoble` para manejar la cola de pacientes.

## Estructura del proyecto
## Análisis general

- Cada tipo de lista tiene ventajas según la operación a realizar.
- Las listas dobles permiten manipular los nodos de forma más flexible.
- Las listas circulares permiten recorrer la lista indefinidamente y son útiles para sistemas cíclicos.
- Cada operación implementada fue probada y documentada con sus casos de error, como posiciones inválidas o lista vacía.

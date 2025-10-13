#  Análisis de Complejidad — Tabla Hash

## Operaciones implementadas
| Operación       | Descripción                          | Complejidad promedio | Peor caso |
|-----------------|--------------------------------------|----------------------|------------|
| `put(key, val)` | Inserta o actualiza un valor         | O(1)                 | O(n)       |
| `get(key)`      | Busca un valor por su clave          | O(1)                 | O(n)       |
| `remove(key)`   | Elimina una clave y devuelve el valor| O(1)                 | O(n)       |
| `containsKey()` | Verifica existencia de clave         | O(1)                 | O(n)       |
| `size()`        | Retorna número de elementos          | O(1)                 | O(1)       |
| `isEmpty()`     | Verifica si la tabla está vacía      | O(1)                 | O(1)       |

---

## Explicación

- En promedio, las operaciones son **O(1)** gracias a la función `hashCode()` que distribuye uniformemente las claves entre los índices.
- En el **peor caso**, todas las claves colisionan y se encadenan en una misma lista, por lo que las operaciones pasan a ser **O(n)**.
- El rendimiento depende directamente de:
  - La **calidad de la función hash**.
  - El **tamaño (capacity)** inicial de la tabla.
  - El **factor de carga** (cuántos elementos hay por cubeta).

---

## Ejemplo de análisis
Supongamos una tabla de 10 cubetas y 100 elementos:
- Si el hash distribuye bien, cada cubeta tendrá ~10 elementos.
- `get()` recorrería solo unos pocos nodos promedio → **O(1)**.
- Si todo cae en una sola cubeta (colisión total), `get()` debe recorrer 100 nodos → **O(n)**.

---

## Conclusión
La tabla hash es una estructura **altamente eficiente** para inserciones, búsquedas y eliminaciones, logrando operaciones en tiempo **constante promedio**.  
El uso de **encadenamiento** asegura que la tabla siempre funcione correctamente, incluso en presencia de colisiones.

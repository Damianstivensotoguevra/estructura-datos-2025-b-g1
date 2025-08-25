# Taller sobre los Tipos de Datos

Este taller está enfocado en el uso y manejo de los tipos de datos en Java, abordado desde diferentes enfoques a través de los ejercicios propuestos.

## Objetivos

- Comprender los tipos de datos primitivos y de referencia en Java.
- Aplicar estructuras de control para validar y procesar datos.
- Implementar funciones que manipulan cadenas, números y estructuras básicas.
- Familiarizarse con la lógica de compresión de datos y validación de entradas.

##Ejercicios 

- Ejercicio 1 Validador de ISBN-13

.Es un algoritmo para validar si el codigo cumple con el checksum del estandar ISBN-13 
es decir que verifica que un  string tnega 13 digitos.

-Ejercicio 2 compresión Run-Length (RLE) 

.Es un ejercicio en el cual lo que se realiza es generar la compresion RLE de una cadena con caracteres repetidos 
y se calcula el ratio de compresión (Longitud comprimida/ original).

-Ejercicio 3 estadísticas de temperatura 

.Dado un string con valores de temperaturas se debe calcular la minima ,maxima ,promedio y su desviacion estandar 
todo por medio del paso a paso que esta establecido.

Paso a paso:

1. Separa con split(",") y parsea a double.

2. Recorre para obtener min, max y sum.

3. Promedio: avg sum /n.

4. Varianza: promedio de (xi avg)^2. Desviación: Math.sqrt(var).

5. Considera entradas vacías o espacios (trim).

-Ejercicio 4 Conversor de bases y control de overflow 

Recibe un número como String y una base de origen (2, 10 o 16). Convierte a las otras dos bases. Si el valor excede el rango de long, usa BigInteger

Paso a paso:

1. Normaliza el String (e.g., hex en mayúsculas).

2. Valida que los caracteres sean válidos para la base indicada.

3. Intenta parsear a long con Long.parseLong en base 10 si cabe; si falla o se desborda, usa BigInteger(String, base).

4. Convierte a binario y hex con toString(2) y toString(16).

5. Reporta si hubo uso de BigInteger (bandera boolean).

- Ejercicio 5 Agregacion de timpos de Ejeucion 

.Dada una lista de tiempos en un formato especifico se debe calcular el tiempo total, promedio , tramo mas largo , porcentaje de cda tramo respecto al total .

Paso a paso:

1. Parsea cada String a segundos: h*3600+ m*60 + s

2. Suma total (long si la lista es grande).

3. Promedio: total / n (usa double para porcentajes).

4. Mantén max y su índice.

5. Convierte segundos de vuelta a HH:MM:SS con divisiones y módulos.

6. Calcula porcentajes (segmento / total) 100. Controla total 0.
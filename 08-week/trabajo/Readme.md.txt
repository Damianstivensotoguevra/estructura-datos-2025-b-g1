Taller: Uso de ArrayList con Clases en Java
🎯 Objetivo

Implementar clases en Java que representen figuras geométricas (Círculo, Rectángulo y Triángulo) y utilizar un ArrayList para almacenar y manipular objetos de estas clases.
El sistema permite registrar las figuras en memoria, calcular su área y perímetro, y mostrar la información en consola.

🛠️ Clases implementadas
🔹 Clase Circulo
Atributos: radio,color

Métodos:
calcularArea(): retorna el área del círculo.
calcularPerimetro(): retorna la longitud de la circunferencia.
mostrarInformacion(): imprime todos los datos del círculo.

🔹 Clase Rectangulo
Atributos: base, altura, color.

Métodos:
calcularArea(): retorna el área del rectángulo.
calcularPerimetro(): retorna el perímetro.

mostrarInformacion(): imprime todos los datos del rectángulo.

🔹 Clase Triangulo
Atributos: lado1, lado2, lado3, color.

Métodos:
calcularArea(): calcula el área usando la fórmula de Herón.
calcularPerimetro(): retorna la suma de los tres lados.
mostrarInformacion(): imprime todos los datos del triángulo.

🔹 Clase Main
Crea un ArrayList de objetos (círculos, rectángulos y triángulos).
Agrega al menos 2 objetos de cada figura.
Recorre el ArrayList y muestra la información de cada figura invocando sus métodos.


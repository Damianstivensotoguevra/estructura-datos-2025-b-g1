package codigo;

      import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList<Object> figuras = new ArrayList<>();

        /*Crear y agregar figuras*/
        figuras.add(new circulo(5, "Rojo"));
        figuras.add(new circulo(3.5, "Azul"));
        figuras.add(new rectangulo(4, 6, "Verde"));
        figuras.add(new rectangulo(2.5, 7, "Amarillo"));
        figuras.add(new triangulo(3, 4, 5, "Negro"));
        figuras.add(new triangulo(6, 6, 6, "Blanco"));

        /*Mostrar la información de cada figura*/
        for (Object figura : figuras) {
            if (figura instanceof circulo) {
                ((circulo) figura).mostrarInformacion();
            } else if (figura instanceof rectangulo) {
                ((rectangulo) figura).mostrarInformacion();
            } else if (figura instanceof triangulo) {
                ((triangulo) figura).mostrarInformacion();
            }
        }
    }
}

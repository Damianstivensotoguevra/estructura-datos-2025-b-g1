package codigo;

public class circulo {
    private double radio;
    private String color;

    public circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrarInformacion() {
        System.out.println("Círculo - Color: " + color +
                ", Radio: " + radio +
                ", Área: " + calcularArea() +
                ", Perímetro: " + calcularPerimetro());
    }
}

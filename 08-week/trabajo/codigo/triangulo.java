package codigo;

public class triangulo {
    private double lado1, lado2, lado3;
    private String color;

    public triangulo(double lado1, double lado2, double lado3, String color) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color = color;
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public void mostrarInformacion() {
        System.out.println("Triángulo - Color: " + color +
                ", Lados: " + lado1 + ", " + lado2 + ", " + lado3 +
                ", Área: " + calcularArea() +
                ", Perímetro: " + calcularPerimetro());
    }
}

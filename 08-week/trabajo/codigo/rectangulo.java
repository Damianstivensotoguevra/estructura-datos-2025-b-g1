package codigo;

public class rectangulo {
    private double base, altura;
    private String color;

    public rectangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarInformacion() {
        System.out.println("Rectángulo - Color: " + color +
                ", Base: " + base +
                ", Altura: " + altura +
                ", Área: " + calcularArea() +
                ", Perímetro: " + calcularPerimetro());
    }
}

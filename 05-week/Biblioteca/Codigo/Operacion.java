import java.time.LocalDateTime;

public class Operacion {
    String tipo; 
    LocalDateTime fechaHora;

    public Operacion(String tipo) {
        this.tipo = tipo;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return tipo + " - " + fechaHora;
    }
}
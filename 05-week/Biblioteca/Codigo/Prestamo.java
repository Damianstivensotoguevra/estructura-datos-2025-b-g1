import java.time.LocalDate;

public class Prestamo {
    public int codigoLibro;
    public String usuario;
    public LocalDate fecha;
    public boolean devuelto;

    public Prestamo(int codigoLibro, String usuario) {
        this.codigoLibro = codigoLibro;
        this.usuario = usuario;
        this.fecha = LocalDate.now();
        this.devuelto = false;
    }
}

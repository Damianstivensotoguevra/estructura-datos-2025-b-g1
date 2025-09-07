public class Libro {
    public int codigo;
    public String titulo;
    public String autor;
    public int stock;
    public boolean activo; 

    public Libro(int codigo, String titulo, String autor, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.activo = true;
    }
    public String toString() {
        return "[" + codigo + "] " + titulo + " - " + autor + " (Stock: " + stock + ")";
    }
}
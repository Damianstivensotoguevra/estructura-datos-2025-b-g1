import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;
    private String[] categorias = {"Tecnología", "Hogar", "Aseo", "Bebidas", "Snacks"};

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public boolean eliminarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(p);
                return true;
            }
        }
        return false;
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public void mostrarCategorias() {
        for (String cat : categorias) {
            System.out.println("* " + cat);
        }
    }

    public String[] getCategorias() {
        return categorias;
    }
}

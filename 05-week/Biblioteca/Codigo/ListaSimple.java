public class ListaSimple {

    private class Nodo {
        Prestamo dato;
        Nodo siguiente;
        Nodo(Prestamo dato) { this.dato = dato; }
    }

    private Nodo cabeza;

    /*Insertar prestamo */
    public void insertar(Prestamo p) {
        Nodo nuevo = new Nodo(p);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    /*Listar prestamo */
    public void listar() {
        Nodo aux = cabeza;
        if (aux == null) {
            System.out.println("📭 No hay préstamos activos.");
            return;
        }
        while (aux != null) {
            System.out.println("Préstamo: Libro " + aux.dato.codigoLibro +" - Usuario: " + aux.dato.usuario +  " - Devuelto: " + aux.dato.devuelto);
            aux = aux.siguiente;
        }
    }

    /*Devolver prestamo */
    public boolean devolverPrestamo(int codigoLibro, String usuario) {
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.dato.codigoLibro == codigoLibro &&
                aux.dato.usuario.equals(usuario) &&
                !aux.dato.devuelto) {

                aux.dato.devuelto = true; /*  marcamos como devuelto*/
                return true; /* devolución exitosa*/
            }
            aux = aux.siguiente;
        }
        return false; /*no se encontró préstamo activo*/
    }
}

public class Biblioteca {

    private static final int MAX_LIBROS = 100;
    private Libro[] catalogo = new Libro[MAX_LIBROS];/* Es arreglo lineal para el catálogo de libros */
    private int contadorLibros = 0;

    ListaSimple prestamos = new ListaSimple();
    ListaDoble historial = new ListaDoble();

    /*Alta de libro */
    public void altaLibro(int codigo, String titulo, String autor, int stock) {
        if (contadorLibros >= MAX_LIBROS) {
            System.out.println(" No hay espacio en el catálogo.");
            return;
        }
        for (int i = 0; i < contadorLibros; i++) {
            if (catalogo[i] != null && catalogo[i].codigo == codigo && catalogo[i].activo) {
                System.out.println(" Ya existe un libro con ese código.");
                return;
            }
        }
        catalogo[contadorLibros] = new Libro(codigo, titulo, autor, stock);
        contadorLibros++;
        historial.insertar(new Operacion("ALTA"));
        System.out.println(" Libro agregado con éxito.");
    }

    /*Baja del libro */
    public void bajaLibro(int codigo) {
        int indice = buscarIndiceLibro(codigo);
        if (indice == -1 || !catalogo[indice].activo) {
            System.out.println(" No se encontró el libro con ese código.");
            return; 
        }
        catalogo[indice].activo = false;
        historial.insertar(new Operacion("BAJA"));
        System.out.println(" Libro dado de baja.");
    }

    /*Buscar libro */
    public void buscarLibro(String texto) {
        boolean encontrado = false;

        for (int i = 0; i < contadorLibros; i++) {
            if (catalogo[i] != null && catalogo[i].activo) {

                /* Buscar por código*/
                try {
                    int codigo = Integer.parseInt(texto);
                    if (catalogo[i].codigo == codigo) {
                        System.out.println(catalogo[i]);
                        encontrado = true;
                        continue;
                    }
                } catch (NumberFormatException e) {
                    /*no es número*/
                }

                /*Buscar por título o autor*/
                if (catalogo[i].titulo.equalsIgnoreCase(texto) ||
                    catalogo[i].autor.equalsIgnoreCase(texto)) {
                    System.out.println(catalogo[i]);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) System.out.println(" No se encontró ningún libro con ese dato.");
    }

    /*Listar catalogo */
    public void listarCatalogo() {
        if (contadorLibros == 0) {
            System.out.println(" No hay libros en el catálogo.");
            return;
        }
        System.out.println("\n Catálogo de libros:");
        for (int i = 0; i < contadorLibros; i++) {
            if (catalogo[i] != null && catalogo[i].activo) {
                System.out.println(catalogo[i]);
            }
        }
    }

    /*Pestrar libro  */ 
    public void prestarLibro(int codigo, String usuario) {
        int indice = buscarIndiceLibro(codigo);
        if (indice == -1 || !catalogo[indice].activo) {
            System.out.println(" No se encontró el libro con ese código.");
            return;
        }
        if (catalogo[indice].stock > 0) {
            Prestamo p = new Prestamo(codigo, usuario);
            prestamos.insertar(p);
            catalogo[indice].stock--;
            historial.insertar(new Operacion("PRÉSTAMO"));
            System.out.println(" Libro prestado con éxito.");
        } else {
            System.out.println(" No hay stock disponible del libro.");
        }
    }

    /*Devolver libro*/
    public void devolverLibro(int codigo, String usuario) {
        boolean devuelto = prestamos.devolverPrestamo(codigo, usuario);
        if (devuelto) {
            catalogo[buscarIndiceLibro(codigo)].stock++;
            historial.insertar(new Operacion("DEVOLUCIÓN"));
            System.out.println(" Libro devuelto correctamente.");
        } else {
            System.out.println(" No se encontró préstamo activo para ese usuario y libro.");
        }
    }

    /*  lista de los prestamos*/
    public void listarPrestamos() {
        prestamos.listar();
    }

    /*Historial*/
    public void historialAdelante() {
        historial.recorrerAdelante();
    }

    public void historialAtras() {
        historial.recorrerAtras();
    }

    /* Metodo auxiliar */
    private int buscarIndiceLibro(int codigo) {
        for (int i = 0; i < contadorLibros; i++)
            if (catalogo[i].codigo == codigo) return i;
        return -1;
    }
}

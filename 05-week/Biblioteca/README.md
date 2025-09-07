Este proyecto es un sistema sencillo de gestión de biblioteca, desarrollado en **Java**, que permite:

- Registrar libros (alta).
- Dar de baja libros.
- Buscar libros por código, título o autor.
- Prestar libros a usuarios.
- Devolver libros prestados.
- Listar catálogo disponible.
- Mostrar préstamos activos.
- Consultar historial de operaciones.

---

## 🚀 Tecnologías usadas
- Lenguaje: **Java 17+**
- Librerías estándar de Java (`java.util`, `java.time`)

---

## 🗂️ Estructura del proyecto

- `Biblioteca.java` → Clase principal que gestiona el catálogo, préstamos e historial.  
- `BibliotecaMain.java` → Contiene el menú principal con las opciones para el usuario.  
- `Libro.java` → Representa cada libro con código, título, autor, stock y estado.  
- `Prestamo.java` → Representa un préstamo con usuario, libro, fecha y estado (devuelto/no devuelto).  
- `ListaSimple.java` → Lista enlazada simple para manejar los préstamos.  
- `ListaDoble.java` → Lista doblemente enlazada para manejar el historial de operaciones.  
- `Operacion.java` → Clase que guarda la operación realizada (alta, baja, préstamo, devolución) junto con la fecha y hora.  

---

## 📖 Cómo ejecutar
1. Clona o descarga el proyecto.  
2. Abre una terminal en la carpeta del proyecto.  
3. Compila las clases:  
   ```bash
   javac *.java

## 🎥 video
Mira la demostración del proyecto aquí: [Ver en YouTube](https://youtu.be/t_u5crN2AcY)

package Codigo.Tablas;

import java.util.HashMap;

public class Gestorusuario {
    private HashMap<String, Usuario> usuarios;

    public Gestorusuario() {
        usuarios = new HashMap<>();
    }

    /*Agrega un nuevo usuario si no existe */
    public void agregarUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getId())) {
            System.out.println(" Ya existe un usuario con el ID: " + usuario.getId());
        } else {
            usuarios.put(usuario.getId(), usuario);
            System.out.println(" Usuario agregado: " + usuario);
        }
    }

    /*Busca un usuario por ID */
    public void buscarUsuario(String id) {
        Usuario u = usuarios.get(id);
        if (u != null) {
            System.out.println(" Usuario encontrado: " + u);
        } else {
            System.out.println(" No existe usuario con ID: " + id);
        }
    }

    /*Elimina un usuario por ID */
    public void eliminarUsuario(String id) {
        Usuario eliminado = usuarios.remove(id);
        if (eliminado != null) {
            System.out.println("🗑️ Usuario eliminado: " + eliminado);
        } else {
            System.out.println("⚠️ No se encontró ningún usuario con ese ID.");
        }
    }

    /*Muestra todos los usuarios registrados */
    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("📭 No hay usuarios registrados.");
        } else {
            System.out.println("📋 Lista de usuarios:");
            usuarios.values().forEach(System.out::println);
        }
    }

    /*Retorna la cantidad total de usuarios */
    public int contarUsuarios() {
        return usuarios.size();
    }
}

package Codigo.pila;
import java.util.Stack;

public class editordetext {
    /*Atributos privados*/
    private StringBuilder texto;       /*contenido actual*/
    private Stack<String> pilaUndo;    /*pila para deshacer*/
    private Stack<String> pilaRedo;    /*pila para rehacer*/

    /*Constructor para dar valores*/
    public editordetext() {
        this.texto = new StringBuilder();
        this.pilaUndo = new Stack<>();
        this.pilaRedo = new Stack<>();
    }

    /*Método privado para guardar el estado antes de un cambio*/
    private void guardarEstado() {
        pilaUndo.push(texto.toString());
        pilaRedo.clear(); /*al hacer un nuevo cambio, se reinicia la pila de redo*/
    }

    /*métodos públicos para utilizar*/

    /*Agregar texto al final*/
    public void escribir(String nuevoTexto) {
        guardarEstado();
        texto.append(nuevoTexto);
    }

    /*Borrar los últimos n caracteres */
    public void borrar(int cantidad) {
        if (cantidad <= 0) return;
        guardarEstado();
        int inicio = Math.max(0, texto.length() - cantidad);
        texto.delete(inicio, texto.length());
    }

    /*Deshacer último cambio */
    public void deshacer() {
        if (pilaUndo.isEmpty()) {
            System.out.println("No hay acciones para deshacer.");
            return;
        }
        pilaRedo.push(texto.toString());
        texto = new StringBuilder(pilaUndo.pop());
    }

    /*Rehacer último cambio*/
    public void rehacer() {
        if (pilaRedo.isEmpty()) {
            System.out.println("No hay acciones para rehacer.");
            return;
        }
        pilaUndo.push(texto.toString());
        texto = new StringBuilder(pilaRedo.pop());
    }

    /*Mostrar texto actual */
    public String obtenerTexto() {
        return texto.toString();
    }
}

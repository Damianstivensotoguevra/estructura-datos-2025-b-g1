package Codigo.Grafos;

import java.util.*;

public class Nodo {
    String nombre;
    Map<Nodo, Integer> vecinos; /*Nodo destino y peso*/

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.vecinos = new HashMap<>();
    }

    public void conectar(Nodo destino, int peso) {
        vecinos.put(destino, peso);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

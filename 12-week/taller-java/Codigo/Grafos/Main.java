package Codigo.Grafos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafo grafo = new Grafo();

        /*Ciudades de ejemplo*/
        grafo.agregarNodo("A");
        grafo.agregarNodo("B");
        grafo.agregarNodo("C");
        grafo.agregarNodo("D");

        grafo.conectar("A", "B", 5);
        grafo.conectar("A", "C", 2);
        grafo.conectar("B", "C", 1);
        grafo.conectar("B", "D", 3);
        grafo.conectar("C", "D", 7);

        grafo.mostrar();

        System.out.print("\nCiudad de origen: ");
        String origen = sc.next();
        System.out.print("Ciudad de destino: ");
        String destino = sc.next();

        grafo.dijkstra(origen, destino);
        sc.close();
    }
}


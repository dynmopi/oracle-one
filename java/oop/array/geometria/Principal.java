package one.oop.array.geometria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        Quadrado quadrado = new Quadrado(5);

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(quadrado);
        
        for (Forma forma : lista) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}

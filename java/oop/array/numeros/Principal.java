package one.oop.array.numeros;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(4);
        lista.add(1);
        lista.add(6);

        Collections.sort(lista);

        System.out.println("Número de ordem crescente: " + lista);
    }
}

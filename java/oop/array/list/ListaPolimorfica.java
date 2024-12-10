package one.oop.array.list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListaPolimorfica {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        // é possivel criar a mesma referência só que em objetos diferentes.
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}

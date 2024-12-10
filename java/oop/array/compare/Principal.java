package one.oop.array.compare;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Titulo> listaQualquer = new ArrayList<>();

        listaQualquer.add(new Titulo("D"));
        listaQualquer.add(new Titulo("C"));
        listaQualquer.add(new Titulo("A"));

        Collections.sort(listaQualquer);

        for (Titulo titulo : listaQualquer) {
            System.out.println(titulo.nome);
        }
    }
}

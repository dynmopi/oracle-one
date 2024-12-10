package one.oop.array.foreach;

import java.util.ArrayList;

public class Programacao {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("C");
        lista.add("Kotlin");
        lista.add("Java");
        lista.add("Python");

        for(String linguagens: lista){
            System.out.println(linguagens);
        }
    }
}

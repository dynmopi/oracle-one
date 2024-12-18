package one.lambdas.alfabetica;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class OrdemAlfabetica {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("mesa", "casa", "guarda roupa", "cama");

//        lista.sort(Comparator.naturalOrder()); com metodo
        lista.sort(String::compareTo); // com metodo de referencia
//      lista.sort((a, b) -> a.compareTo(b)); // com lambda
        System.out.println(lista);
    }
}

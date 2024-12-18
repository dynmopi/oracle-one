package one.lambdas.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaInteiros {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2, 4, 6, 8);
        lista.replaceAll(n -> n * 3); // esse metodo implementa a interface funcional
        System.out.println(lista);
    }
}

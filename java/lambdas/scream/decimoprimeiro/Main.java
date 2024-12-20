package one.lambdas.scream.decimoprimeiro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        int somaDosQuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .reduce(0, Integer::sum);

        System.out.println(somaDosQuadrados);
        // código da filtragem e agrupamento dos dados
    }
}
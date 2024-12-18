package one.lambdas.scream.primeiro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}

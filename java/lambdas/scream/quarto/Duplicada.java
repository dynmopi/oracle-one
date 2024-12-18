package one.lambdas.scream.quarto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicada {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        palavras.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

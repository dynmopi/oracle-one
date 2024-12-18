package one.lambdas.scream.segundo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LetrasMaiusculas {
    public static void main(String[] args){
        List<String> palavras = Arrays.asList("java", "stream", "lambda");

        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

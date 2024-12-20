package one.lambdas.scream.oitavo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

            numeros.stream()
                    .filter(n -> n > 40)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);



            // código do agrupamento
        }
    }


package one.lambdas.scream.quinto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarPrimos {

    private static boolean verificarPrimo(int n){
        if (n <= 1) return false;

        for (int i = 2; i*i < n ; i+=2) { // valores grandes não funcionam
            if(n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> primos = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(OrdenarPrimos::verificarPrimo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(primos);


//        listaDeNumeros.stream()
//                .filter(l -> )
    }
}

package one.lambdas.scream.decimoquarto;

import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty


    }
    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
         var resultado =  numero
                .filter(n -> n > 0 && numero.isPresent())
                 .map(n -> n*n);

         return resultado;


    }
}
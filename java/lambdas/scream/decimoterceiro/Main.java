package one.lambdas.scream.decimoterceiro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        input.stream()
                .filter(Main::isConversorStringDouble)
                .map(Double::valueOf)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    private static boolean isConversorStringDouble(String str){
        try{
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}

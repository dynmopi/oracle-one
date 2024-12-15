package one.lambdas.soma;

public class SomaNumero {
    @FunctionalInterface
    interface Soma {
        int soma(int a, int b);
    }
    public static void main(String[] args) {
        Soma soma = (a, b) -> a + b;
        System.out.println(soma.soma(4, 9));
    }
}

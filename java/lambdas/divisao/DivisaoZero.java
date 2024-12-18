package one.lambdas.divisao;

public class DivisaoZero {
    interface Divisao{
        int numeros(int a, int b);
    }

    public static void main(String[] args) {
        Divisao divisao = (a, b) -> {
            if(b == 0) throw new ArithmeticException("Não é possível dividir por zero");
            return a/b;
        }; // nao esquece desse ; depois da estrutura lambda

        try {
            System.out.println(divisao.numeros(4, 2));
            System.out.println(divisao.numeros(24, 8));
            System.out.println(divisao.numeros( 10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

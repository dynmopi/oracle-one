package one.lambdas.primo;

@FunctionalInterface
interface Primo {
    boolean verificar(int n);
}

public class Lambda {
    public static void main(String[] args) {
        Primo primo = n -> {
            if (n <= 1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.verificar(25));
        System.out.println(primo.verificar(18));
        System.out.println(primo.verificar(19));
        System.out.println(primo.verificar(40));
    }

}


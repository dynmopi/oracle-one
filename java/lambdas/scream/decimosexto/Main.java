package one.lambdas.scream.decimosexto;

public class Main {
    public static void main(String[] args) {
        System.out.println(ehPalindromo("subi no onibus em marrocos")); // Saída: false
        System.out.println(ehPalindromo("Java")); // Saída: false
        System.out.println(ehPalindromo("arara")); // true



    }
    public static boolean ehPalindromo(String palavra) {
        // Implementar aqui
        String semEspacos = palavra.replace(" ", "").toLowerCase();
        return new StringBuilder(semEspacos).reverse().toString().equals(semEspacos);
    }

}

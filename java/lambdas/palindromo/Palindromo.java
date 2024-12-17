package one.lambdas.palindromo;

public class Palindromo {

@FunctionalInterface
    interface IVerificarPalindromo{
        Boolean verificar(String a, String b);
    }
    public static void main(String[] args){
        var palavra = "arara";
        StringBuilder palavraManipulavel = new StringBuilder(palavra);
        palavraManipulavel.reverse();

        IVerificarPalindromo iverificarPalindromo = (a, b) -> (palavra.equals(palavraManipulavel.toString()));

        System.out.println(iverificarPalindromo.verificar(palavra, palavraManipulavel.toString()));
    }
}

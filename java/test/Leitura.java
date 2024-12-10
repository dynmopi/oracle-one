package one.aulas;

import java.util.Scanner; // é um objeto interno do java que permite utilizar metodo
// para a entrada de dados

public class Leitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano e lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga a sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}

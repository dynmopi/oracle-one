package one.desafios;

public class Desafio {
    public static void main(String[] args){
        //1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        float nota1 = 9;
        float nota2 = 7;
        double media = (double)(nota1 + nota2) / 2;
        System.out.println(media);

        //2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double varDouble = 3.14;
        int varInt = (int)(varDouble);
        System.out.println(varInt);

        //3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'd';
        String palavra = "anrley";

        String mensagem = letra + palavra;
        System.out.println(mensagem);

        //4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 5.5;
        int quantidade = 10;

        System.out.println("O valor total a pagar é de: " + precoProduto*quantidade);

        //5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 4.94;
        double valorEmReais = 7255.5;

        String resultado = String.format("%.2f", valorEmReais/valorEmDolares);
        System.out.println("O valor de" + valorEmReais + " para o dolar é de: " + resultado);

        //5. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        float precoOriginal = 500;
        float percentualDesconto = 20;

        float precoDescontado = 500 - (500 * 20/100);
        System.out.println("O preço do produto é de " + precoOriginal + " reais, com desconto de " + percentualDesconto + "% o valor a se pagar é de " + precoDescontado);

    }
}

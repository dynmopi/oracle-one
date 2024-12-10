package one.desafios;

import java.util.Scanner;

public class DesafioSegundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        System.out.println("Digite um número");
        double n = scanner.nextDouble();

        if (n > 0) {
            System.out.println("Seu número é positivo");
        } else {
            System.out.println("Seu número é negativo");
        }

        // 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        System.out.println("Digite dois valores respectivos");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior do que " + n2 + " logo são diferentes");

        } else if (n1 < n2) {
            System.out.println("O número " + n1 + " é menor do que " + n2 + " logo são diferentes");
        } else {
            System.out.println("Os números são iguais");
        }
//3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("""
                ---------------------------------------------
                Pressione: 
                    1 para calcular a área do quadrado
                    2 para calcular a área do círculo
                ---------------------------------------------
                """);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Digite o valor da aresta do quadrado");
                double l = scanner.nextDouble();
                double area = l * l;
                System.out.println("A área do quadrado é de: " + area + " u²");
                break;
            case 2:
                System.out.println("Digite o valor do raio do círculo");
                double r = scanner.nextDouble();
                double areaCirculo = 3.14 * r * r;
                System.out.println("A área do círculo é de: " + areaCirculo + " u²");
        }
        //4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite um valor inteiro para que possa ser imprimido a tabuada desse valor ");
        // tabuada = t
        int t = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(t + " x " + i + " = " + t * i);
        }
        //5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("Digite um número inteiro");
        int d2 = scanner.nextInt();
        int parImp = d2 % 2;

        if(parImp == 0){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

        // 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("""
                -------------------
                Cálculo de fatorial
                Digite um valor: 
                
                                """);
        int fat = scanner.nextInt();
        int oriFat = fat;

        for (int c = (fat - 1); c > 0; c--){
            fat *= c;
        }
        System.out.println("O fatorial de " + oriFat + " é de: " + fat);

    }
}

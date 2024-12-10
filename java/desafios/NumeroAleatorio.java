package one.desafios;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args){
    /* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.*/
        int numeroGerado = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
//        System.out.println(numeroGerado);

        System.out.println("----------------------");
        System.out.println("Jogo do número secreto");
        System.out.println("----------------------");

        for(int i = 7; i > 0; i--){
            System.out.println("Você tem " + i + " tentativas, digite um número entre 0 e 100: ");
            int n = scanner.nextInt();

            if(numeroGerado > n){
                System.out.println("O número secreto é maior do que " + n + """
                        
                        """);
            } else if(numeroGerado == n) {
                System.out.println("Parabéns, você ganhou, o número secreto é: " + numeroGerado);
                break;
            } else {
                System.out.println("O número secreto é menor do que " + n + """
                        
                        """);
            }
            if(i == 1){
                System.out.println("Infelizmente, não ganhou");
            }
        }
    }
}

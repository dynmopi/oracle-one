package one.trycatch.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Indique o número a ser dividido: ");
        int dividendo = scanner.nextInt();
        System.out.println("Informe o número que divide: ");
        int divisor = scanner.nextInt();




            int quociente = dividendo / divisor;
            System.out.println("O resultado é: " + quociente);}
        catch (InputMismatchException e){
            System.out.println("[Erro] informe apenas valores inteiros");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("[Erro] não há como dividir inteiros por zero");
            System.out.println(e.getMessage());
        }
    }
}

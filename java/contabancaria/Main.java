package one.contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500;
        System.out.println("""
                ------------------------------------------------------------
                Nome: Danrley Silva Maranhão
                Tipo de conta: Corrente
                Saldo inicial: R$ 2500,00
                ------------------------------------------------------------
                 Operações
                
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir
                    4 - Sair
                """);
//
        String menu = """
        Operações

        1 - Consultar saldos
        2 - Receber valor
        3 - Transferir
        4 - Sair 
        """;

        for (int operador = scanner.nextInt(); operador != 4; operador = scanner.nextInt()){
            if(operador <= 0 || operador > 4){
                System.out.println("Erro, operação inválida");
                System.out.println(menu);
            } else {
                switch (operador) {
                    case 1:
                        System.out.println("O seu valor atual é de " + saldo);
                        System.out.println(menu);
                        break;
                    case 2:
                        // receber
                        System.out.println("Informe o valor a receber: ");
                        double receber = scanner.nextInt();
                        saldo += receber;
                        System.out.println("Valor atualizado: " + saldo);
                        System.out.println("Valor preenchido: " + receber + "\n");
                        System.out.println(menu);
                        break;
                    case 3:
                        System.out.println("Informe o valor para ser transferido: ");
                        double transferencia = scanner.nextDouble();
                        if (saldo < transferencia) {
                            System.out.println("Não é possível fazer a transação");
                            System.out.println("Seu saldo atual é de: " + saldo);
                            System.out.println(menu);
                        } else {
                            saldo -= transferencia;
                            System.out.println("Valor atualizado: " + saldo);
                            System.out.println("Valor transferido: " + transferencia + "\n");
                            System.out.println(menu);
                        }
                        // transferir
                        break;
                    case 4:
                        // sair
                        break;
                    default:
                        System.out.println("Erro valor inválido!");
                        break;
                }
            }
        }
    }
}

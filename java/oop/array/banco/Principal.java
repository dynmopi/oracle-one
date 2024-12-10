package one.oop.array.banco;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Danrley", 500, 77);
        ContaBancaria conta2 = new ContaBancaria("Davi", 650, 7);

        ArrayList<ContaBancaria> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);

        ContaBancaria menorSaldo = lista.get(0);
        for (ContaBancaria conta: lista) {
            if(conta.getSaldo() < menorSaldo.getSaldo()){
                menorSaldo = conta;
            }
            System.out.println(conta.getSaldo());
        }

        System.out.println("Numero: " + menorSaldo.getNumeroConta());
        System.out.println("Conta com o menor saldo: " + menorSaldo.getSaldo());

    }
}

package one.oop.array.banco;

public class ContaBancaria {
    String nome;
    double saldo;
    int numeroConta;

    public ContaBancaria(String nome, double saldo, int numeroConta){
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

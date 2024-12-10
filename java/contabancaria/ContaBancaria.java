package one.contabancaria;

public class ContaBancaria {

    private int numeroConta;
    private int saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}

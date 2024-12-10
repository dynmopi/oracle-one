package one.oop.Banco;

public class Principal {
    public static void main(String[] args) {

        ContaBancaria contaTeste = new ContaBancaria();

        contaTeste.setDepositar(400);
        contaTeste.setDepositar(800);
        contaTeste.getConsultar();
        contaTeste.setSacar(500);
        contaTeste.getConsultar();


    }
}

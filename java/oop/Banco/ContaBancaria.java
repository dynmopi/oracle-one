package one.oop.Banco;

public class ContaBancaria {
    private double sacar;
    private double depositar;
    private double consulta;


    public void setSacar(double sacar) {
        this.sacar = sacar;
        consulta -= sacar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
        consulta += depositar;
    }

    public void getConsultar(){
        System.out.println("Valor total: " + consulta);
    }



}

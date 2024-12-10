package one.oop.Banco;

public class ContaCorrente extends ContaBancaria{
    private double cobrarTarifaMensal;
    private double tarifa;

    public double CobrarTarifaMensal(double consulta){
        return tarifa = consulta * 10*100;
    }
}

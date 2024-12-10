package one.oop.conversor;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override // sobrescreve a interface tida em ConversaoFinanceira
    public void converterDolarParaReal(double valorDolar){
        double cotacaoDolar = 6.08;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em R$ é: " + valorReal);


    }

}

package one.oop.primoTT;

public class GeradorPrimo extends VerificarPrimalidade {

    public GeradorPrimo(int valor){
        super(valor);
    }
    public void geradorPrimo(){
        int numeroSucessor = getValor() + 1;
        while(!verificarPrimo()){
            System.out.println(numeroSucessor);

            numeroSucessor++;

        }

        System.out.println("O próximo número primo é: " + numeroSucessor);
    }

}

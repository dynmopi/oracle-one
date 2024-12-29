package one.lambdas.scream.decimooitavo;

public enum Mes {

    JANEIRO(20),
    FEVEREIRO(10);




    private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int getNumeroDeDias(){
        return numero;
    }


}

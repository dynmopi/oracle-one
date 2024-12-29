package one.lambdas.scream.decimonono;

public enum Moeda {
    DOLAR(6.09),
    EURO(6.31);

    private final double cotacao;

    Moeda(double cotacao){
        this.cotacao = cotacao;
    }

    public double converterPara(double valorEmReais){
        return valorEmReais / cotacao;
    }
}


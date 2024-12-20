package one.lambdas.scream.decimosegundo;

public class Produto {
    private String descricao;
    private double valor;
    private String categoria;

    public Produto(String descricao, double valor, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

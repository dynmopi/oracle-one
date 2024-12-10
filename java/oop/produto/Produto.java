package one.oop.produto;

public class Produto {
    private String nome;
    private double preco;
    private double percentual;

    public double aplicarDesconto(){
        return preco - (preco*percentual/100);
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPercentual(){
        return percentual;
    }

    public void setPercentual(double percentual){
        this.percentual = percentual;
    }
}

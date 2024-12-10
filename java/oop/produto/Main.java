package one.oop.produto;


public class Main {
    public static void main(String[] args){
        Produto produto = new Produto();

        produto.setPreco(100);
        produto.setPercentual(10);
        produto.setNome("Garrafa térmica");

        System.out.println("O produto " + produto.getNome() + " tem " + produto.getPercentual() +
                " de desconto, e o seu preco final é de: " + produto.aplicarDesconto());
    }
}

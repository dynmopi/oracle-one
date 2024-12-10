package one.oop.array.produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        // manda os construtores alocar na memória, os parâmetros escolhidos
        Produto sabao = new Produto("Sabão", 5.45, 3);
        Produto detergente = new Produto("Detergente", 8.00, 2);
        Produto qualquerProduto = new Produto("QualquerProduto", 1000, 1);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto D", 14.00, 2, "03/12/2024");


        lista.add(sabao);
        lista.add(detergente);
        lista.add(qualquerProduto);
        lista.add(produtoPerecivel);

        System.out.println("Tamanho da lista de produtos: " + lista.size());
        System.out.println("Produto da primeira posição: " + lista.get(0).getNome());

//        System.out.println(qualquerProduto);
//        System.out.println(produtoPerecivel);

        double somaPrecos = 0;
        for (Produto produto : lista) {
            System.out.println(produto);
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / lista.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

    }
}

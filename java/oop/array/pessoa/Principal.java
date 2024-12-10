package one.oop.array.pessoa;

import java.util.ArrayList;

public class Principal {    
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Danrley", 24);
        Pessoa pessoa2 = new Pessoa("Davi", 18);
        Pessoa pessoa3 = new Pessoa("Vânia", 30);

        lista.add(pessoa1); lista.add(pessoa2); lista.add(pessoa3);

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primeira Pessoa: " + lista.get(0));
        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }

}

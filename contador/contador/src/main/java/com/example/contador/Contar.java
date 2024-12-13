package com.example.contador;

public class Contar {
    public int valor;

    public Contar(int valor) {
        this.valor = valor;
    }

    public void aplicacao(){
        for (int i = 1; i <= valor; i++) {
            System.out.print(i + " ");// imprimindo os valores contados no terminal
            if(i == valor){
                System.out.println();
            }
        }
    }
}

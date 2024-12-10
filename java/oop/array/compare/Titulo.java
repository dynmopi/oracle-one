package one.oop.array.compare;

public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String n){
        this.nome = n;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.nome.compareTo(outroTitulo.nome);
    }
}

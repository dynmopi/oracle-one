package one.oop.aluno;

public class Aluno {
    private String nome;
//    private double nota; nao precisa dessa variavel, pois nota é um parâmetro do metodo somaMedia
    private double somaMedia;
    private int totalMedia;

    double calcularMedia(){
        return somaMedia/totalMedia;
    }

    void somaMedia(double nota){
        somaMedia += nota;
        totalMedia++;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }




}

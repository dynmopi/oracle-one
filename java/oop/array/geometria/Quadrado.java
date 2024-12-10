package one.oop.array.geometria;

public class Quadrado implements Forma {
    double lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
}

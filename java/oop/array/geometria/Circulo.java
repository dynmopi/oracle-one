package one.oop.array.geometria;

public class Circulo implements Forma{
    double raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}

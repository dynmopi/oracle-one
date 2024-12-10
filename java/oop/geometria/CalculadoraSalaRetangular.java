package one.oop.geometria;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
//    public void calculoArea(double altura, double largura){
//        double area = altura * largura;
//        System.out.println("Área: " + area);
//    }
//
//    public void calculoPerimetro(double altura, double largura){
//        double perimetro = 2 * (altura + largura);
//        System.out.println("Perímetro: " perimetro);
//    }

    public void calcular(double altura, double largura){
        double area = altura * largura;
        double perimetro = 2 * (altura + largura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

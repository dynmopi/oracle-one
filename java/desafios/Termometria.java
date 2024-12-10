package one.desafios;

public class Termometria {
    public static void main(String[] args) {
        System.out.println("Celsius para Fahrenheit");
        double celsius = 543;
        double fahrenheit = celsius * 1.8 + 32;

        int fahrenheitInt = (int)(fahrenheit);

        System.out.println("A temperatura em Fahrenheit é de: " + fahrenheitInt);
    }
}

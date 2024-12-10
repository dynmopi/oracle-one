package one.oop.temperatura;

public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        double temperaturaCelsius = 100;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);

        System.out.println("A temperatura " + temperaturaCelsius + " Celsius," + " é em Fahrenheit " + temperaturaFahrenheit);

        temperaturaFahrenheit = 32;
        temperaturaCelsius = conversor.FahrenheitParaCelsius(temperaturaFahrenheit);

        System.out.println("A temperatura " + temperaturaFahrenheit + " Fahrenheit,"+ " é em Celsius " + temperaturaCelsius);


    }
}

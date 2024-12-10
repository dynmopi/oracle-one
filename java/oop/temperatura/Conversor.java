package one.oop.temperatura;

public class Conversor implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9/5) + 32;
    }

    @Override
    public double FahrenheitParaCelsius(double temperaturaFahrenheit) {
        return  (temperaturaFahrenheit - 32) * 5 / 9;
    }
}

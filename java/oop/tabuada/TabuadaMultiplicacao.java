package one.oop.tabuada;

public class TabuadaMultiplicacao implements MostrarTabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do: " + numero);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}

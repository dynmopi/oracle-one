package one.oop.primoTT;

public class Principal {
    public static void main(String[] args) {


//        VerificarPrimalidade verificadorPrimo = new VerificarPrimalidade();
//        verificadorPrimo.setValor(16);
//        System.out.println(verificadorPrimo.getValor());

        VerificarPrimalidade testeNumero = new VerificarPrimalidade(10);
//        System.out.println(testeNumero.verificarPrimo());

        testeNumero.imprimirPrimo();

        GeradorPrimo proximoPrimo = new GeradorPrimo(10);
        proximoPrimo.geradorPrimo();

//        ListarPrimos sequenciaPrimo = new ListarPrimos();
        // sequenciaPrimo.
    }
}

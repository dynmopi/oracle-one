package one.oop.primo;

public class VerificadorPrimo extends NumerosPrimos {
    /*Herda de NumerosPrimos que consegue usar o verificarPrimalidade(int numero), para imprimir se "numero" é primo ou não*/

    public void verificarSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)){ /* o número escolhido é o 17, e aqui será feito o teste lógico na classe que contém esse method. A classe em questão é o NumerosPrimos. */

            // retornando true, o output é. 17 é primo
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }
}

package one.oop.primo;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero){
// Aqui será feito o teste lógico para caso o número escolhido for primo

        if(numero <= 1){return false;} // retorna false caso o número for menor ou igual a 1.

        // laço de repetição que divide o número por sequências multiplicativas.
        // se um número não é divisível por 3, nem 4 e tampouco 5, a chance de ser primo é maior.
//        4 <= 17; i++; i = 2+1
//        17 % 3 == 0? false
//        9 <= 17; i++; i = 3+1
//        17 % 4 == 0 ? false
//        16 <= 17; i++; i = 4+1
//        17 % 5 == 0 ? false
//        25 <= 17; fim
//        return true;
        for (int i = 2; i * i <= numero ; i++) {
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    // outro metodo da classe NumerosPrimos
    public void listarPrimos(int limiteSuperior){
        // limiteSuperior = 30
        System.out.println("Números primos até " + limiteSuperior + ": ");
        // laco de repeticao que testa os valores incrementados, abaixos de 30
        for (int i = 2; i < limiteSuperior; i++) {
            // perceba que nesse "fori", o i recebe 2, pois no teste lógico em verificarPrimalidade, não são aceitos números iguais ou abaixos de 1
            if(verificarPrimalidade(i)){ // mesma ideia do gerarProximoPrimo();
                System.out.println(i + " ");
            }
        }
    }
}

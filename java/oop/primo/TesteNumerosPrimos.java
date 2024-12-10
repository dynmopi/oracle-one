package one.oop.primo;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo(); // cria o objeto da classe VerificadorPrimo
        verificador.verificarSeEhPrimo(17); // imprime se é ou não primo, de acordo com o parâmetro pré-estabelecido

        GeradorPrimo gerador = new GeradorPrimo(); // não gera um valor aleatório, mas sim procura saber o próximo numero primo com base no valor anterior.

        int proximoPrimo = gerador.gerarProximoPrimo(17); // guardando numa variável, eu posso escrever o numero, do objeto criado na classe GeradorPrimo
        System.out.println("O próximo número primo é " + proximoPrimo); // imprimindo 19

        NumerosPrimos numerosPrimos = new NumerosPrimos(); // aqui é criado um outro objeto na classe pai, pois há um method de listarPrimos.
        numerosPrimos.listarPrimos(30);
    }
}

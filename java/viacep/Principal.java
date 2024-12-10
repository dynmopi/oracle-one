package one.viacep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o cep para a busca: ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep); // a construcao mencionada.
            System.out.println(novoEndereco);


            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.gerarJson(novoEndereco);

        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizado");
    }
}
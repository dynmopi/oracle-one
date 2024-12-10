package one.viacep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        // padrao request response

        // já cria uma variavel do tipo URI, para evitar muito código.
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
// trycatch
        try{

            HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
            // biblioteca de serializacao e desserializacao
            // é para manipular dados do json
            return new Gson().fromJson(response.body(), Endereco.class);
            // os dados irao para a classe Endereco

        } catch(Exception e){
            // caso ocorrer algum digito invalido
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }
    }


}

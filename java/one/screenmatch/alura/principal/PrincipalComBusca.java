package one.one.screenmatch.alura.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import one.one.screenmatch.alura.excecoes.ErroDeConversaoDeAnoException;
import one.one.screenmatch.alura.modelos.Titulo;
import one.one.screenmatch.alura.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create(); // isso daqui é para manter as boas práticas de nomear variaveis;

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }
            try {
                String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=e3f4c7fd";

                // requisicao do server para o java local.
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                // response é o resultado do envio de request
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);



//        Titulo titulo = gson.fromJson(json, Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);


                titulos.add(meuTitulo);

            } catch (NumberFormatException e){
                System.out.println("Erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Erro de formatação na busca");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e){
                System.out.println(e.getMensagem());
            }

        }
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Finalizado");

    }
}
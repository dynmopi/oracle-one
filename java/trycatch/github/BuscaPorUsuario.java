package one.trycatch.github;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaPorUsuario {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();

        String address = "https://api.github.com/users/" + user;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHub("Usuário não encontrado no GitHub. [ERRO 404] ");
            }

            System.out.println(response.body());

        } catch (IOException | InterruptedException e){
            System.out.println("Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHub e){
            System.out.println(e.getMessage());
        }
    }
}

package one.apitest.googlebooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o livro: ");
        var search = prompt.next();

        String address = "https://www.googleapis.com/books/v1/volumes?q=" + search + "&key=AIzaSyDE7zmzZdxjpD5Q9etxOzaA_Wz_gMd4OUo"; // chave da api criada específicamente.

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

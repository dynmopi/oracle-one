package one.apitest.cripto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Cripto {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Informe a criptomoeda: ");
        Scanner scanner = new Scanner(System.in);
        var search = scanner.next();


        String address = "https://api.coingecko.com/api/v3/simple/price?ids="+search+"&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Cotação: " + response.body());

    }
}

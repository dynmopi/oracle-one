package one.viacep;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo  {
    public void gerarJson(Endereco endereco) throws IOException{
        // aqui é serializado, para isso é preciso da biblioteca Gson

        // padrao
        Gson gson = new GsonBuilder()
                .setPrettyPrinting() // para o json ficar legivel para humanos
                .create();

        // aqui é um outro import para criar um arquivo novo
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();

    }
}

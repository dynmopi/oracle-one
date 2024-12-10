package one.viacep;

// record já cria objetos, instancia, implementa getsetters de uma maneira rápida.
// esse record, enviara para a classe Principal devido o return na classe ConsultaCep
// o envio se dá com a construcao do objeto na classe Principal
public record Endereco(String cep, String logradouro,
                      String complemento, String bairro,
                      String localidade, String uf) {
}

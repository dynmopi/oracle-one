package one.one.screenmatch.alura.excecoes;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

        public ErroDeConversaoDeAnoException(String mensagem){
            this.mensagem = mensagem;
        }

    public String getMensagem() {
        return mensagem;
    }
}

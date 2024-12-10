package one.trycatch.senha;

public class VerificadorSenha extends RuntimeException {
    public VerificadorSenha(String message) {
        super(message);
    }
}

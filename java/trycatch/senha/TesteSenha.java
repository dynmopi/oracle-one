package one.trycatch.senha;

import java.util.Scanner;

public class TesteSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (VerificadorSenha e){
            System.out.println(e.getMessage());

        }
    }

    private static void validarSenha(String senha){
        if(senha.length() <= 8){
            throw new VerificadorSenha("[Erro] Informe uma senha acima de 8 caracteres");
        }
    }

}

package one.oop.pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa qualquerPessoa = new Pessoa();
        qualquerPessoa.saudacao();

        // Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

        idadePessoa pessoa = new idadePessoa();
        pessoa.setIdade(18); // aqui que imprime se é maior ou não de idade.
        pessoa.setNome("O nome da pessoa é Danrley, e a sua idade é de: " + pessoa.getIdade()); // o getIdade é onde imprime a idade colocada no set.
        System.out.println(pessoa.getNome());




    }
}

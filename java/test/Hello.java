package one.aulas;
// 1
public class Hello {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top gun: Maverick");

        int anoDeLancamento = 2020;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        
        double media = (9.8 + 6.3 + 8.0)/3;
        String sinopse;
        // """, trata-se de um recurso do java 15 que facilita a interpolação das strings, cujo nome é
        // text block
        sinopse = """
                Filme Top Gun 
                Filme com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);

    }
}
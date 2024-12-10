package one.oop.musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvalicoes;

    void exibirFichaTecnica(){
        System.out.println("O nome do título é: " + titulo);
        System.out.println("O nome do artista é: " + artista);
        System.out.println("O ano de lançamento dessa pedrada é: " + anoLancamento);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvalicoes++;
    }

    double exibirMedia(){
        return avaliacao / numAvalicoes;
    }
}

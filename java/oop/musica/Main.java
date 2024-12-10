package one.oop.musica;

public class Main {
    public static void main(String[] args) {
        Musica yamanduCosta = new Musica();

        yamanduCosta.titulo = "Mariana";
        yamanduCosta.artista = "Yamandu Costa";
        yamanduCosta.anoLancamento = 2001;

        yamanduCosta.avaliarMusica(10);
        yamanduCosta.avaliarMusica(8);
        yamanduCosta.avaliarMusica(9);
        yamanduCosta.avaliarMusica(10);


        yamanduCosta.exibirFichaTecnica();
        System.out.println("A média das notas é de: " + yamanduCosta.exibirMedia());
    }
}

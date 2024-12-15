//package one.screenmatchAutentico.modelo;
//
//public class Titulo {
//    // Organizando o código
//    // Variaveis com os modifiers
//    private String nome;
//    private int anoDeLancamento;
//    private boolean incluidoNoPlano;
//    public double somaDasAvaliacoes;
//    public int totalDeAvaliacoes;
//    private int duracaoDeMinutos;
//    //
//
//    // Operacao do sistema
//    public void exibeFichaTecnica() {
//        System.out.println("Filme: " + nome);
//        System.out.println("Ano de lançamento: " + anoDeLancamento);
//        System.out.println("Duração em minutos: " + duracaoDeMinutos);
//        System.out.println("Incluído no plano: " + incluidoNoPlano);
//    }
//
//    public void avalia(double nota) {
//        somaDasAvaliacoes += nota;
//        totalDeAvaliacoes++;
//    }
//
//
//    public double adquireMedia() {
//        return somaDasAvaliacoes / totalDeAvaliacoes;
//    }
//    //
//
//    // metodos getSetters (seguranca)
//    public void setNome(String nome) {
//        this.nome = nome; // o nome foi incluido atraves do setter
//    }
//
//
//    public String getNome() {
//        return nome; // o nome pode ser imprimido também
//    }
//
//    public void setAnoDeLancamento(int anoDeLancamento) {
//        this.anoDeLancamento = anoDeLancamento;
//    }
//
//    public int getAnoDeLancamento(){
//        return anoDeLancamento; // agora posso mostrar o ano de lancamento pelo get.
//    }
//
//    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
//        this.incluidoNoPlano = incluidoNoPlano;
//    }
//
//    public boolean getIncluidoNoPlano() {
//        return incluidoNoPlano;
//    }
//
//    public void setDuracaoDeMinutos(int duracaoDeMinutos) {
//        this.duracaoDeMinutos = duracaoDeMinutos;
//    }
//
//    public int getDuracaoDeMinutos() {
//        return duracaoDeMinutos;
//    }
//
//
//    public int getTotalDeAvaliacoes() {
//        return totalDeAvaliacoes;
//    }
//}

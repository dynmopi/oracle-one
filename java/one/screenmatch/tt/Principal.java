//package one.screenmatchAutentico;
//
//import one.screenmatchAutentico.calculos.FiltroRecomendacao;
//import one.screenmatchAutentico.modelo.Episodio;
//import one.screenmatchAutentico.modelo.Filme;
//import one.screenmatchAutentico.modelo.Serie;
//
//public class Principal {
//    public static void main(String[] args) {
//        Filme umFilme = new Filme();
//        Serie umaSerie = new Serie();
//        Episodio umEpisodio = new Episodio();
//
//        // Primeiro Filme
//        umFilme.setNome("Poderoso chefão"); // note, enviou o nome de forma segura
//        umFilme.setAnoDeLancamento(2010);
//        umFilme.setDuracaoDeMinutos(180);
//        umFilme.setIncluidoNoPlano(true);
//        umFilme.setDiretor("Desconhecido");
//
//
////        umFilme.exibeFichaTecnica();
//        umFilme.avalia(2);
//        umFilme.avalia(8);
//
//        // exibeFichaTecnica
//        System.out.println("O nome do filme é: " + umFilme.getNome()); // o nome é imprimido
//        System.out.println("A média do filme é de: " + umFilme.adquireMedia());
//        System.out.println("O total de avaliações é de: " + umFilme.getTotalDeAvaliacoes());
//        //
//
//        System.out.println("--------------------------");
//        //Serie
//
//        umaSerie.setNome("Strange Doctor");
//        umaSerie.setTemporadas(5);
////        umaSerie.setDuracaoDeMinutos(40); @Override
//        umaSerie.setEpisodiosPorTemporada(12);
//        umaSerie.setMinutosPorEpisodio(40);
//
//        // exibeFichaTecnica
//        System.out.println("O nome da série é: " + umaSerie.getNome());
//        System.out.println("O número de temporadas é de: " + umaSerie.getTemporadas());
//        System.out.println("A duração de cada episódio é: " + umaSerie.getMinutosPorEpisodio());
//        System.out.println("A duração total de minutos da série é: " + umaSerie.getDuracaoDeMinutos());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(umFilme);
//
//
//        umEpisodio.setNumero(1);
//        umEpisodio.setSerie("lost");
//        umEpisodio.setTotalVisualizacoes(300);
//        filtro.filtra(umEpisodio);
//
//    }
//}
//

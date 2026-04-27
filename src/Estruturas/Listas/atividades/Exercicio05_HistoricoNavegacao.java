package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio05_HistoricoNavegacao {
    static class Pagina {
        String tituloPagina;
        String endereco;
 
        public Pagina(String tituloPagina, String endereco) {
            this.tituloPagina = tituloPagina;
            this.endereco = endereco;
        }
 
        @Override
        public String toString() {
            return "Pagina{titulo='" + tituloPagina + "', url='" + endereco + "'}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Pagina> historico = new LinkedList<>();
 
        historico.adiciona(new Pagina("Google", "https://www.google.com"));
        historico.adiciona(new Pagina("YouTube", "https://www.youtube.com"));
        historico.adiciona(new Pagina("GitHub", "https://www.github.com"));
        historico.adiciona(new Pagina("Stack Overflow", "https://stackoverflow.com"));
        historico.adiciona(new Pagina("Wikipedia", "https://www.wikipedia.org"));
        historico.adiciona(new Pagina("Reddit", "https://www.reddit.com"));
        historico.adiciona(new Pagina("Netflix", "https://www.netflix.com"));
        historico.adiciona(new Pagina("Spotify", "https://www.spotify.com"));
 
        // Mostrando o histórico completo
        System.out.println("=== Histórico de Navegação ===");
        System.out.println(historico);
 
        // Informando se uma página foi visitada
        Pagina buscada = new Pagina("", "https://www.github.com");
        System.out.println("\nGitHub foi visitado? " + historico.contem(buscada));
 
        Pagina naoVisitada = new Pagina("", "https://www.twitter.com");
        System.out.println("Twitter foi visitado? " + historico.contem(naoVisitada));
 
        // Mostrando a última página visitada
        System.out.println("\nÚltima página visitada: " + historico.pegaUltimo());
 
        // Quantidade total de páginas
        System.out.println("Total de páginas no histórico: " + historico.getTamanho());
    }
}

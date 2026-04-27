package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio02_Playlist {
    
     static class Musica {
        String titulo;
        String artista;
 
        public Musica(String titulo, String artista) {
            this.titulo = titulo;
            this.artista = artista;
        }
 
        @Override
        public String toString() {
            return "Musica{titulo='" + titulo + "', artista='" + artista + "'}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Musica> playlist = new LinkedList<>();
 
        // Adicionando 6 músicas
        playlist.adiciona(new Musica("Bohemian Rhapsody", "Queen"));
        playlist.adiciona(new Musica("Stairway to Heaven", "Led Zeppelin"));
        playlist.adiciona(new Musica("Hotel California", "Eagles"));
        playlist.adiciona(new Musica("Smells Like Teen Spirit", "Nirvana"));
        playlist.adiciona(new Musica("Imagine", "John Lennon"));
        playlist.adiciona(new Musica("Billie Jean", "Michael Jackson"));
 
        // Exibindo a playlist completa
        System.out.println("=== Playlist ===");
        System.out.println(playlist);
 
        // Verificando se uma música específica está na lista
        Musica buscada = new Musica("Imagine", "John Lennon");
        System.out.println("\nA música '" + buscada.titulo + "' está na playlist? " + playlist.contem(buscada));
 
        Musica naoExiste = new Musica("Shape of You", "Ed Sheeran");
        System.out.println("A música '" + naoExiste.titulo + "' está na playlist? " + playlist.contem(naoExiste));
 
        // Mostrando quantas músicas existem
        System.out.println("\nTotal de músicas na playlist: " + playlist.getTamanho());
    }
}

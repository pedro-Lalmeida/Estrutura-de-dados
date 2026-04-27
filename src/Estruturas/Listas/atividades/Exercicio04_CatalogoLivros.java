package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio04_CatalogoLivros {
    
    // classe interna para não criar outro arquivo
    static class Livro {
        String titulo;
        String autor;
        int anoPublicacao;
 
        public Livro(String titulo, String autor, int anoPublicacao) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
        }
 
        @Override
        public String toString() {
            return "Livro{titulo='" + titulo + "', autor='" + autor + "', ano=" + anoPublicacao + "}";
        }

    }
 
    public static void main(String[] args) {
 
        LinkedList<Livro> catalogo = new LinkedList<>();
 
        // Cadastrando 5 livros
        catalogo.adiciona(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogo.adiciona(new Livro("O Cortiço", "Aluísio Azevedo", 1890));
        catalogo.adiciona(new Livro("Iracema", "José de Alencar", 1865));
        catalogo.adiciona(new Livro("Vidas Secas", "Graciliano Ramos", 1938));
        catalogo.adiciona(new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956));
 
        // Mostrando todos os livros
        System.out.println("=== Catálogo de Livros ===");
        System.out.println(catalogo);
 
        // Exibindo o primeiro livro cadastrado
        System.out.println("\nPrimeiro livro: " + catalogo.pegaPrimeiro());
 
        // Exibindo o último livro cadastrado
        System.out.println("Último livro: " + catalogo.pegaUltimo());
    }
}

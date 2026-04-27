package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio07_EstoqueProdutos  {
    static class Produto {
        String nome;
        double preco;
        int quantidadeEstoque;
 
        public Produto(String nome, double preco, int quantidadeEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }
 
        @Override
        public String toString() {
            return "Produto{nome='" + nome + "', preco=R$" + String.format("%.2f", preco)
                    + ", estoque=" + quantidadeEstoque + "}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Produto> estoque = new LinkedList<>();
 
        // Adicionando 5 produtos
        estoque.adiciona(new Produto("Notebook", 3500.00, 10));
        estoque.adiciona(new Produto("Mouse", 89.90, 50));
        estoque.adiciona(new Produto("Teclado", 149.90, 30));
        estoque.adiciona(new Produto("Monitor", 1200.00, 15));
        estoque.adiciona(new Produto("Headset", 299.90, 20));
 
        // Exibindo todos os produtos
        System.out.println("=== Estoque de Produtos ===");
        System.out.println(estoque);
 
        // Mostrando o produto em uma determinada posição
        int posicao = 2;
        System.out.println("\nProduto na posição " + posicao + ": " + estoque.pega(posicao));
 
        // Verificando se um produto existe no estoque
        Produto busca1 = new Produto("Monitor", 0, 0);
        Produto busca2 = new Produto("Impressora", 0, 0);
        System.out.println("\n'Monitor' existe no estoque? " + estoque.contem(busca1));
        System.out.println("'Impressora' existe no estoque? " + estoque.contem(busca2));
 
        // Mostrando o primeiro e o último produto cadastrados
        System.out.println("\nPrimeiro produto: " + estoque.pegaPrimeiro());
        System.out.println("Último produto: " + estoque.pegaUltimo());
    }
}

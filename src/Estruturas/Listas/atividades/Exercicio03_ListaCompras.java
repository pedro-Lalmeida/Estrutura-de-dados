package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio03_ListaCompras {
    
    // classe interna 
    static class ItemCompra {

        String nomeProduto;
        int quantidade;
 
        public ItemCompra(String nomeProduto, int quantidade) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
        }
 
        @Override
        public String toString() {
            return "ItemCompra{produto='" + nomeProduto + "', quantidade=" + quantidade + "}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<ItemCompra> listaCompras = new LinkedList<>();
 
        
        listaCompras.adiciona(new ItemCompra("Arroz", 2));
        listaCompras.adiciona(new ItemCompra("Feijão", 1));
        listaCompras.adiciona(new ItemCompra("Macarrão", 3));
        listaCompras.adiciona(new ItemCompra("Óleo", 1));
        listaCompras.adiciona(new ItemCompra("Sal", 1));
        listaCompras.adiciona(new ItemCompra("Açúcar", 2));
        listaCompras.adiciona(new ItemCompra("Café", 1));
 
        // Exibindo todos os itens
        System.out.println("=== Lista de Compras ===");
        System.out.println(listaCompras);
 
        // Mostrando o item em uma posição informada
        int posicao = 3;
        System.out.println("\nItem na posição " + posicao + ": " + listaCompras.pega(posicao));
 
        // Verificando se um produto foi adicionado
        ItemCompra busca1 = new ItemCompra("Café", 0);
        ItemCompra busca2 = new ItemCompra("Leite", 0);
        System.out.println("\n'" + busca1.nomeProduto + "' está na lista? " + listaCompras.contem(busca1));
        System.out.println("'" + busca2.nomeProduto + "' está na lista? " + listaCompras.contem(busca2));
 
        // Contando quantos itens foram cadastrados
        System.out.println("\nTotal de itens na lista: " + listaCompras.getTamanho());
    }
}

package Estruturas.Listas.Testes_LinkedList;
import Estruturas.Listas.LinkedList;

public class Teste1 {

    public static void main(String[] args) {
        
        LinkedList<Integer> lista = new LinkedList<>();
        
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        
        System.out.println(lista);

        // busca por elemento
        // retorna a posição do elemento 
        System.out.println("-------Busca por elemento-------");
        System.out.println("Buscando o elemento 0: " + lista.busca(0));
        System.out.println("Buscando o elemento 1: " + lista.busca(1));
        System.out.println("Buscando o elemento 2: " + lista.busca(2));
        System.out.println("Buscando o elemento 3: " + lista.busca(3));
        System.out.println("Buscando o elemento 4: " + lista.busca(4));
        System.out.println("Buscando o elemento 5: " + lista.busca(5));

        // busca por posição
        // retorna o elemento da posição
        System.out.println("-------Busca por posição-------");
        System.out.println("Buscando na posição 0: " + lista.buscaPorPosicao(0));
        System.out.println("Buscando na posição 1: " + lista.buscaPorPosicao(1));
        System.out.println("Buscando na posição 2: " + lista.buscaPorPosicao(2));
        //System.out.println("Buscando na posição -1: " + lista.buscaPorPosicao(-1));
        //System.out.println("Buscando na posição 6: " + lista.buscaPorPosicao(6));

    }
}
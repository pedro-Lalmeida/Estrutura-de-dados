package Estruturas.Listas.Testes_LinkedList;

import Estruturas.Listas.LinkedList;

public class teste2 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.adiciona(40);
        lista.adiciona(10);
        lista.adiciona(30);
        lista.adiciona(20);

        System.out.println("Posição 0: " + lista.buscaPorPosicao(0)); // esperado: 40
        System.out.println("Posição 1: " + lista.buscaPorPosicao(1)); // esperado: 10
        System.out.println("Posição 2: " + lista.buscaPorPosicao(2)); // esperado: 30
        System.out.println("Posição 3: " + lista.buscaPorPosicao(3)); // esperado: 20
    }

}

package testes;

import main.Vetor;

public class TesteVetor1 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("Pedro");
        vetor.adicionar("Aldo");
        vetor.adicionar("Paulo");

        System.out.println("Tamanho: " + vetor.tamanho());

        vetor.imprimir();

        System.out.println("Elementos um por linha:");
        vetor.imprimeUmPorLinha();
    }
}

package testes;

import main.Vetor;

public class TesteVetor8 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");

        vetor.remove("B");
        vetor.imprimir();

        System.out.println(vetor.remove("X"));
    }
}

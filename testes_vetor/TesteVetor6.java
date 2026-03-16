package testes_vetor;

import main.Vetor;

public class TesteVetor6 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("Aldo");
        vetor.adicionar("Elson");
        vetor.adicionar("Mateus");

        boolean resultado = vetor.substituir("Aldo", "Paulo");

        System.out.println("Substituição realizada? " + resultado);

        vetor.imprimir();

        boolean resultado2 = vetor.substituir("Pedro", "Luis");

        System.out.println("Substituição realizada? " + resultado2);

    }
}

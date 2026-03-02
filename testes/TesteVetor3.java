package testes;

import main.Vetor;

public class TesteVetor3 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try {

            System.out.println("Último: " + vetor.ultimo());

        } catch (IllegalStateException e) {

            System.out.println("Erro: " + e.getMessage());

        }

        vetor.adicionar("Marcos");
        vetor.adicionar("Aldo");

        try {

            System.out.println("Último: " + vetor.ultimo());

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }
}

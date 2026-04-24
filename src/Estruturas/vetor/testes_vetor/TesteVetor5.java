package Estruturas.vetor.testes_vetor;
import Estruturas.vetor.Vetor;

public class TesteVetor5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("José");
        vetor.adicionar("Lucas");
        vetor.adicionar("José");
        vetor.adicionar("José");

        

        System.out.println("José aparece: " + vetor.contarOcorrencias("José") + " vezes");

    }
}
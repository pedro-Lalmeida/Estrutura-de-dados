package testes_vetor;
import main.Vetor;

public class TesteVetor5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("José");
        vetor.adicionar("Lucas");
        vetor.adicionar("José");
        vetor.adicionar("José");

        int total = vetor.contarOcorrencias("José");

        System.out.println("José aparece: " + total + " vezes");

    }
}
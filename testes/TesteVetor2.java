package testes;
import main.Vetor;

public class TesteVetor2 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("Pedro");
        vetor.adicionar("Lucas");
        vetor.adicionar("Paulo");
        vetor.adicionar("Mateus");

        System.out.println("Onde está Paulo? " + vetor.buscar("Paulo"));
        System.out.println("Contém Mateus? " + vetor.contem("Mateus"));
        System.out.println("Contém Lucas? " + vetor.contem("Lucas"));

    }
}
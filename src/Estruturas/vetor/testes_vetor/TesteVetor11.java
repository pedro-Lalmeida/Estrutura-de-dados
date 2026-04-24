package Estruturas.vetor.testes_vetor;
import Estruturas.vetor.Vetor;

public class TesteVetor11 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("C");

        vetor.imprimir();

        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("B");
        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("C");

        vetor.imprimir();
    }
}

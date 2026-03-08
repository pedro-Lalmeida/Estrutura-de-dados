package testes;
import main.Vetor;

public class TesteVetor7 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");

        vetor.remover(0);
        vetor.imprimir();

        vetor.remover(1);
        vetor.imprimir();

        vetor.remover(vetor.tamanho() - 1);
        vetor.imprimir();
    }
}

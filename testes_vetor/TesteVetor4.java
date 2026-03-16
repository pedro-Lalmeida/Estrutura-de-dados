package testes_vetor;
import main.Vetor;

public class TesteVetor4 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("Marcos");
        vetor.adicionar("Vinícios");
        vetor.adicionar("Pedro");

        System.out.println("Antes de limpar:");
        vetor.imprimir();

        vetor.limpar();

        System.out.println("Depois de limpar:");
        vetor.imprimir();

    }
}

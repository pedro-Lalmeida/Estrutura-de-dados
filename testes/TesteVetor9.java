package testes;
import main.Vetor;
public class TesteVetor9 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");
        vetor.adicionar("B");

        System.out.println(vetor.indiceUltimo("B"));
    }
}
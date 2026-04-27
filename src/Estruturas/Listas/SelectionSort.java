package Estruturas.Listas;

public class SelectionSort {

    
    /*
     * <T extends Comparable<T>> -> o generic extends o Comparable para que possa
     * comparar variáveis válidas, já que o método não sabe o que vai comparar
     * Exemplo:
     * - Integer ✅
     * - String ✅
     * - Cachorro ❌
     */


    public static <T extends Comparable<T>> void ordenar(LinkedList<T> lista) {

        int tamanho = lista.getTamanho();

        for (int i = 0; i < tamanho - 1; i++) {

            int posicaoMenor = i; // assumimos que a menor posição seja i

            for (int j = i + 1; j < tamanho; j++) {

                T elementoJ = lista.buscaPorPosicao(j);                 // buscamos o elemento da posição posterior a de i
                T elementoMenor = lista.buscaPorPosicao(posicaoMenor);  // buscamos o elemento que iremos supor ser o menor

                if (elementoJ.compareTo(elementoMenor) < 0) {           // usamos compareTo para comparar o elemento j com o elementoMenor
                    posicaoMenor = j;
                }
            }
            if (posicaoMenor != i) {
                lista.trocar(i, posicaoMenor);
            }

        }
    }
}
package Estruturas.Listas;

public class SelectionSort {

    /*
     * <T extends Comparable<T>> -> o generic extends o Comparable para que possa
     * comparar
     * variáveis válidas.
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

                T elementoJ = lista.buscaPorPosicao(j);
                T elementoMenor = lista.buscaPorPosicao(posicaoMenor);

                /*
                 * compareTo:
                 * retorna negativo → elementoJ é MENOR
                 * retorna zero → são IGUAIS
                 * retorna positivo → elementoJ é MAIOR
                 */

                if (elementoJ.compareTo(elementoMenor) < 0) {
                    posicaoMenor = j;
                }

            }

            if (posicaoMenor != i) {
                lista.trocar(i, posicaoMenor);
            }

        }
    }
}
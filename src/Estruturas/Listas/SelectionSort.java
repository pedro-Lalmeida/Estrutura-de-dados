package Estruturas.Listas;

import Estruturas.Listas.LinkedList;

public class SelectionSort {
    /*
    <T extends Comparable<T> -> o genetic extends o Comparable para que possa comparar
    variáveis válidas.
    Exemplo:
    - Integer  ✅
    - String   ✅
    - Cachorro ❌
    
    */
    public static <T extends Comparable<T>> void ordenar(LinkedList<T> lista) {

        int tamanho = lista.getTamanho();

        for (int i = 0; i < tamanho - 1; i++) {

            int posicaoMenor = i;

            for (int j = i+1; j < tamanho; j++) {

                T elementoJ = lista.buscaPorPosicao(j);
                T elmentoMenor = lista.buscaPorPosicao(posicaoMenor);

                
                if (elementoJ.compareTo(elmentoMenor) < 0) {
                    posicaoMenor = j;
                }
                
                /*
                CompateTo:
                    retorna negativo → elementoJ é MENOR
                    retorna zero → são IGUAIS
                    retorna positivo → elementoJ é MAIOR
                */

            if (posicaoMenor != i) {
                lista.trocar(i, posicaoMenor);
            }
            }
        }
    }
}

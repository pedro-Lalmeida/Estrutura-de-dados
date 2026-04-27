package Estruturas.Listas.Testes_LinkedList;
import Estruturas.Listas.LinkedList;
import Estruturas.Listas.SelectionSort;

public class teste_selectionSort {


    public static void main(String[] args) {

        // ── Testando o Selection Sort ───────────────────

        LinkedList<Integer> listaParaOrdenar = new LinkedList<>();
        listaParaOrdenar.adiciona(40);
        listaParaOrdenar.adiciona(10);
        listaParaOrdenar.adiciona(30);
        listaParaOrdenar.adiciona(20);

        System.out.println("\nAntes de ordenar: " + listaParaOrdenar);
        // Saída: [40, 10, 30, 20]

        SelectionSort.ordenar(listaParaOrdenar);

        System.out.println("Depois de ordenar: " + listaParaOrdenar);
        // Saída: [10, 20, 30, 40]

        // ── Testando com Strings ────────────────────────

        LinkedList<String> nomes = new LinkedList<>();
        nomes.adiciona("Carlos");
        nomes.adiciona("Ana");
        nomes.adiciona("Bruno");

        System.out.println("\nNomes antes: " + nomes);
        SelectionSort.ordenar(nomes);
        System.out.println("Nomes depois: " + nomes);
        // Saída: [Ana, Bruno, Carlos]
    }

}

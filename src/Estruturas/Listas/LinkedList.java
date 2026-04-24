package Estruturas.Listas;

public class LinkedList<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

    // lógicas implementadas: inserir no final
    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula; // se a lista estiver vazia, o inicio recebe a celula
        } else {
            this.ultimo.setProximo(celula); // setando o valor celula no proximo do ultimo
        }

        this.ultimo = celula; // o ultimo elemento recebe o valor da celula
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    // lógicas implementadas: Limpar a lista
    public void limpar() {

        System.out.println("Limpando a lista...");

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null); // apaga o elemento
            atual.setProximo(null); // apaga a referência
            atual = proximo; // recebe o próximo valor
        }

        this.inicio = null; // resetando o início da lista
        this.ultimo = null; // resetando o último da lista
        this.tamanho = 0; // resetando o tamanho da lista
    }

    private No<T> buscaNo(int posicao) {

        // vrifica se a paosição não existe
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida: não existe na lista.");
        }

        No<T> atual = this.inicio;

        for (int i = 1; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    // busca o elemento na posição
    // retorna o elemento
    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    // busca por elemento
    // retorna a posição
    public int busca(T elemento) {

        int posicao = 0;

        for (No<T> atual = this.inicio; atual != null;) {

            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }

            posicao++;
            atual = atual.getProximo(); // recebe o valor do proximo para interar
        }

        return NAO_ENCONTRADO;
    }

    // lógicas implementadas: percerrendo a lista
    @Override
    public String toString() {

        // [] -> lista vazia
        if (tamanho == 0) {
            return "[]";

        }

        // setup
        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;

        // percorrendo
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }

        builder.append(atual.getElemento()).append("]");

        /*
         * builder.append(atual.getElemento()).append(", ");
         * 
         * while (atual.getProximo() != null) {
         * atual = atual.getProximo();
         * builder.append(atual.getElemento()).append(", ");
         * }
         */

        return builder.toString();
    }

}
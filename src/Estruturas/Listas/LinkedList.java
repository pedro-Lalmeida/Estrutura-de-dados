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

    // inseri no inicio
    public void adicionainicio(T elemento) {

        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<T>(elemento, this.inicio);
            this.inicio = novoNo;
        }

        this.tamanho++;
    }

    /*
     * lÓGICA DE INSERIR NO MEIO:
     * 1. cria uma referêncio do elemento que está inserido para outro posterior
     * 2. apaga a referência do No anterior que estava referenciando
     * 3. liga o No anterior para o novo No que será inserido no meio
     */
    public void adiciona(int posicao, T elemento) {

        // se a posicao não for válida
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida: não existe na lista.");
        }

        if (posicao == 0) { // esta vazia
            this.adicionainicio(elemento); // inseri no inicio
        } else if (posicao == this.tamanho) {
            this.adiciona(elemento); // inseri no final
        } else { // meio
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }

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

        // verifica se a paosição não é válida
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        No<T> atual = this.inicio;

        for (int i = 0; i < posicao; i++) {
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

    public void trocar(int posicaoA, int posicaoB) {
        No<T> noA = this.buscaNo(posicaoA);
        No<T> noB = this.buscaNo(posicaoB);

        T temp = noA.getElemento(); // guarda o valor de A temporariamente
        noA.setElemento(noB.getElemento()); // A recebe o valor de B
        noB.setElemento(temp); // B recebe o valor guardado (antigo A)
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
package main;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalStateException("Posicao inválida!");
        }
        for (int i = tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String ultimo() {
        if (estaVazia()) {
            throw new IllegalStateException("O vetor está vazio!");
        }
        return elementos[tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public String buscar(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalStateException("Posição inválida!");
        }
        return elementos[posicao];
    }

    public int buscar(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    public int contarOcorrencias(String elemento) {
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    public boolean substituir(String antigo, String novo) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i].equals(antigo)) {
                elementos[i] = novo;
                return true;
            }

        }

        return false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }

        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public void imprimir() {
        System.out.print("Vetor: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }

        System.out.println();
    }

    // PARTES D, E e F

    public void remover(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public boolean remove(String elemento) {

        int posicao = buscar(elemento);

        if (posicao == -1) {
            return false;
        }

        remover(posicao);
        return true;
    }

    public int indiceUltimo(String elemento) {

        for (int i = tamanho - 1; i >= 0; i--) {

            if (elementos[i].equals(elemento)) {
                return i;
            }

        }

        return -1;
    }

    public void removerTodos(String elemento) {

        while (remove(elemento)) {

        }

    }

    public boolean adicionarSeNaoExiste(String elemento) {

        if (contem(elemento)) {
            return false;
        }

        return adicionar(elemento);
    }

    // NÃO ENTENDI COMO FAZ O 16 -> inserirDepois

}
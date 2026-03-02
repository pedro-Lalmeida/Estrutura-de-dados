package main;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            System.out.println("Vetor cheio!");
        }
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

    public int buscar(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
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

    public void imprimir() {
        System.out.print("Vetor: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }

        System.out.println();
    }
}
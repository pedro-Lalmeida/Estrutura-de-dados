package main;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // if -> verifica se tem espaço
    // adiciona com base no tamanho disponível
    public boolean adicionar(String elemento) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    // adicona com base na posição
    // if -> verifica se a posição é válida
    // for -> percorre do final até a posição
    // empurra os outro elementos para a direita
    // adiciona na posição que colocou e aumenta o tamanho
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
        return this.tamanho == 0;
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

    // retorna o elemento pela posição
    public String buscar(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalStateException("Posição inválida!");
        }
        return elementos[posicao];
    }

    // retorna o indice do elemento
    // percorre a lista
    // verifica se o elemento do índice é ao elemento recebido 
    public int buscar(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // limpa o vetor
    //percorre o vetor e cada elemento é colocado como null
    // tamanho fica zero
    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    // percorre o vetor 
    // compara cada elemento
    // retorna a ocorrências por um contador
    public int contarOcorrencias(String elemento) {
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    // percorre o vetor
    // procura o elemento antigo
    // o elemento antido é substituído pelo novo
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

        for (int i = 0; i < tamanho-1; i++) {
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

    // percorre o vetor
    // cada elemento recebe uma cópia do que está a direita
    // o final fica com uma cópia e depois é removido
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

    // remove o elemento de acordo com a posição
    public boolean remove(String elemento) {

        int posicao = buscar(elemento);

        if (posicao == -1) {
            return false;
        }

        remover(posicao);
        return true;
    }


    // busca a ultima ocorrência do elemento no vetor
    // for percorre de trás para frente
    //verifica se o elemento é o mesmo e retorna o índice
    public int indiceUltimo(String elemento) {

        for (int i = tamanho - 1; i >= 0; i--) {

            if (elementos[i].equals(elemento)) {
                return i;
            }

        }

        return -1;
    }

    // remove todos os elementos com while
    public void removerTodos(String elemento) {

        while (remove(elemento)) {

        }

    }

    // verifica se o elemento existe no vetor
    // se sim retorna false e se não, adiciona usando o método
    public boolean adicionarSeNaoExiste(String elemento) {

        if (contem(elemento)) {
            return false;
        }

        return adicionar(elemento);
    }

    // adiciona o elemento depois de outro
    // busca a posição do elemento de referência
    // cria uma nova posição a direita do elemento de referência
    // adiciona na nova posição
    public boolean inserirDepois(String referencia, String novoElemento) {
        int posicaoRef = buscar(referencia);

        if (posicaoRef == -1) {
            return false;
        }

        int novaPosicao = posicaoRef + 1;

        if (tamanho < elementos.length) {
            adicionar(novaPosicao, novoElemento);
            return true;
        }

        return false;

    }

}
package Estruturas.Listas;

public class LinkedList<T> {
    
    private No<T> inicio;
    private int tamanho;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);     
        this.inicio = celula;                   // quarda a referencia do inicio 
        this.tamanho++;   
    }

    public int getTamanho() {
        return tamanho;
    }
    
    @Override
    public String toString() {
        return "LinkedList [inicio=" + inicio + ", tamanho=" + tamanho +  "]";
    }

    

}
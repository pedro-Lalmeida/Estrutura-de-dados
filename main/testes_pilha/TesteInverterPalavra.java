package testes_pilha;

import main.Pilha;

public class TesteInverterPalavra {
    public static void main(String[] args) {

        String palavraOriginal = "Melhor bonito que feio";

        String [] palavras = palavraOriginal.split(" ");

        Pilha pilha = new Pilha(palavras.length);

        for (String p : palavras) {
            pilha.empilha(p);
        }

    
        String fraseInvertida = "";
        while (!pilha.estaVazia()) {
            fraseInvertida += pilha.desempilha();

            if (!pilha.estaVazia()) {
                fraseInvertida += " ";
            }
        }
        
        System.out.println("Original: " + palavraOriginal);
        System.out.println("Frase invertida: " + fraseInvertida);

    }
}

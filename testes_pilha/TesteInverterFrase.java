package testes_pilha;

import main.Pilha;

public class TesteInverterFrase {
    public static void main(String[] args) {

        String palavraOriginal = "Melhor bonito que feio";

        // separa as palavras da string
        String [] palavras = palavraOriginal.split(" ");

        Pilha pilha = new Pilha(palavras.length);

        // vai ser empilhado cada palavra na pilha
        for (String p : palavras) {
            pilha.empilha(p);
        }

        // cria uma variável para armazenar a frase invertida
        // enquanto a pilha não estiver vazia a variável vai receber a frase de forma invertida
        String fraseInvertida = "";
        while (!pilha.estaVazia()) {
            fraseInvertida += pilha.desempilha();

            // gerar um espaço em cada palavra
            if (!pilha.estaVazia()) {
                fraseInvertida += " ";
            }
        }
        
        System.out.println("Original: " + palavraOriginal);
        System.out.println("Frase invertida: " + fraseInvertida);

    }
}

package testes_pilha;

import main.Pilha;

public class TestePalindromo {
    public static void main(String[] args) {

        String palavraOriginal = "arara";
        Pilha pilha = new Pilha(palavraOriginal.length());

        for (int i = 0; i < palavraOriginal.length(); i++) {
            pilha.empilha(String.valueOf(palavraOriginal.charAt(i)));
        }

        String palavraInvertida = "";
        while (!pilha.estaVazia()) {
            palavraInvertida += pilha.desempilha();
        }

        if (palavraOriginal.equals(palavraInvertida)) {
            System.out.println(palavraOriginal + " -> É palíndromo");
        } else {
            System.out.println(palavraOriginal + " -> Não é palíndromo");
        }
    }
}

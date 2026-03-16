package testes_pilha;

import main.Pilha;

public class TestePalindromo {
    public static void main(String[] args) {

        String palavraOriginal = "arara";
        Pilha pilha = new Pilha(palavraOriginal.length());

        // converte cada caractere em string e empilha
        for (int i = 0; i < palavraOriginal.length(); i++) {
            pilha.empilha(String.valueOf(palavraOriginal.charAt(i)));
        }  

        // cria uma variável para receber o resultado
        // enquanto a pilha não estiver vazia a variável vai receber o a palavra de forma invertida
        String palavraInvertida = "";
        while (!pilha.estaVazia()) {
            palavraInvertida += pilha.desempilha();
        }


        // verifica se a palavra original é iqual a invertida
        if (palavraOriginal.equals(palavraInvertida)) {
            System.out.println(palavraOriginal + " -> É palíndromo");
        } else {
            System.out.println(palavraOriginal + " -> Não é palíndromo");
        }
    }
}

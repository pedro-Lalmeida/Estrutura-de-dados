package testes_pilha;

import main.Pilha;

public class TesteInverter {
    public static void main(String[] args) {
        
        String palavra = "Hello";

        Pilha pilhaInversora = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilhaInversora.empilha(String.valueOf(palavra.charAt(i)));
        }

        String resultado = "";
            while (!pilhaInversora.estaVazia()) {
                resultado += pilhaInversora.desempilha();
            }
            
        System.out.println("Original: " + palavra);
        System.out.println("Invertida: " + resultado);
    }
}

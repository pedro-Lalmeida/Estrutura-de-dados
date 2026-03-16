package testes_pilha;

import main.Pilha;

public class TestePilha {
    public static void main(String[] args) {

        Pilha pilha1 = new Pilha(10);
        
        
        pilha1.empilha("A");
        pilha1.empilha("B");
        pilha1.empilha("C");


        // IMPLEMENTAÇÃO
        System.out.println("Pilha completa: " + pilha1.toString());

        System.out.println("Topo: " + pilha1.topo());
        System.out.println("Removendo: " + pilha1.desempilha());
        System.out.println("topo: " + pilha1.topo());

        System.out.println("Pilha completa: " + pilha1.toString());
    }
}

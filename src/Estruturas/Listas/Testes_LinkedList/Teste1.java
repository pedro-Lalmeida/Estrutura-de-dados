package Estruturas.Listas.Testes_LinkedList;
import Estruturas.Listas.LinkedList;

public class Teste1 {

    public static void main(String[] args) {
        
        LinkedList<Integer> lista = new LinkedList<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        
        System.out.println(lista);
        
        lista.limpar();
        System.out.println(lista);
    }
}
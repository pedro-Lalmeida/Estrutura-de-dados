package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio06_ListaConvidados {
    
    static class Convidado {
        String nome;
        String cpf;
 
        public Convidado(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }
 
        @Override
        public String toString() {
            return "Convidado{nome='" + nome + "', cpf='" + cpf + "'}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Convidado> listaConvidados = new LinkedList<>();
 
        // Cadastrando 6 convidados
        listaConvidados.adiciona(new Convidado("Carlos Andrade", "111.222.333-44"));
        listaConvidados.adiciona(new Convidado("Fernanda Costa", "222.333.444-55"));
        listaConvidados.adiciona(new Convidado("Gustavo Ribeiro", "333.444.555-66"));
        listaConvidados.adiciona(new Convidado("Helena Martins", "444.555.666-77"));
        listaConvidados.adiciona(new Convidado("Igor Nascimento", "555.666.777-88"));
        listaConvidados.adiciona(new Convidado("Juliana Pereira", "666.777.888-99"));
 
        // Exibindo a lista completa
        System.out.println("=== Lista de Convidados ===");
        System.out.println(listaConvidados);
 
        // Verificando se um convidado específico está cadastrado
        Convidado busca1 = new Convidado("", "444.555.666-77"); // Helena Martins
        Convidado busca2 = new Convidado("", "999.000.111-22"); // Não cadastrado
        System.out.println("\nHelena Martins (CPF 444.555.666-77) está na lista? " + listaConvidados.contem(busca1));
        System.out.println("CPF 999.000.111-22 está na lista? " + listaConvidados.contem(busca2));
 
        // Informando o número total de convidados
        System.out.println("\nTotal de convidados: " + listaConvidados.getTamanho());
    }
}

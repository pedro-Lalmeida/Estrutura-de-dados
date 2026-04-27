package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio08_AgendaContatos {
 
    // Classe interna representando um Contato
    static class Contato {
        String nome;
        String telefone;
 
        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }
 
        @Override
        public String toString() {
            return "Contato{nome='" + nome + "', telefone='" + telefone + "'}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Contato> agenda = new LinkedList<>();
 
        // Adicionando 6 contatos
        agenda.adiciona(new Contato("Lucas Oliveira", "(84) 99999-0001"));
        agenda.adiciona(new Contato("Marina Silva", "(84) 99999-0002"));
        agenda.adiciona(new Contato("Pedro Alves", "(84) 99999-0003"));
        agenda.adiciona(new Contato("Rafaela Gomes", "(84) 99999-0004"));
        agenda.adiciona(new Contato("Samuel Rocha", "(84) 99999-0005"));
        agenda.adiciona(new Contato("Tatiane Fonseca", "(84) 99999-0006"));
 
        // Exibindo todos os contatos
        System.out.println("=== Agenda de Contatos ===");
        System.out.println(agenda);
 
        // Verificando se um contato está cadastrado
        Contato busca1 = new Contato("", "(84) 99999-0003"); // Pedro Alves
        Contato busca2 = new Contato("", "(84) 88888-0000"); // Não existe
        System.out.println("\nTelefone (84) 99999-0003 (Pedro Alves) está na agenda? " + agenda.contem(busca1));
        System.out.println("Telefone (84) 88888-0000 está na agenda? " + agenda.contem(busca2));
 
        // Exibindo quantos contatos existem
        System.out.println("\nTotal de contatos na agenda: " + agenda.getTamanho());
    }
}
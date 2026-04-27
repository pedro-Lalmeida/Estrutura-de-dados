package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;
import Estruturas.Listas.Testes_LinkedList.*;;

public class Exercicio01_ListaChamada  {
    
    // Classe interna representando um Aluno
    static class Aluno {
        String nome;
        String matricula;
 
        public Aluno(String nome, String matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }
 
        @Override
        public String toString() {
            return "Aluno{nome='" + nome + "', matricula='" + matricula + "'}";
        }
 
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Aluno)) return false;
            Aluno outro = (Aluno) obj;
            return this.matricula.equals(outro.matricula);
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Aluno> listaChamada = new LinkedList<>();
 
        // Adicionando 5 alunos na lista
        listaChamada.adiciona(new Aluno("Ana Souza", "2024001"));
        listaChamada.adiciona(new Aluno("Bruno Lima", "2024002"));
        listaChamada.adiciona(new Aluno("Carla Mendes", "2024003"));
        listaChamada.adiciona(new Aluno("Diego Ferreira", "2024004"));
        listaChamada.adiciona(new Aluno("Elisa Santos", "2024005"));
 
        // Mostrando todos os alunos cadastrados
        System.out.println("=== Lista de Chamada ===");
        System.out.println(listaChamada);
 
        // Mostrando o primeiro aluno
        System.out.println("\nPrimeiro aluno: " + listaChamada.pegaPrimeiro());
 
        // Mostrando o último aluno
        System.out.println("Último aluno: " + listaChamada.pegaUltimo());
 
        // Informando quantos alunos existem
        System.out.println("Total de alunos: " + listaChamada.getTamanho());
    }
}

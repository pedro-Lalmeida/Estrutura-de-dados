package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio09_BoletimNotas {
    
    static class RegistroNota {
        String disciplina;
        double notaFinal;
 
        public RegistroNota(String disciplina, double notaFinal) {
            this.disciplina = disciplina;
            this.notaFinal = notaFinal;
        }
 
        @Override
        public String toString() {
            return "RegistroNota{disciplina='" + disciplina + "', nota=" + notaFinal + "}";
        }
 
    }
 
    public static void main(String[] args) {
 
        LinkedList<RegistroNota> boletim = new LinkedList<>();
 
        // Adicionando 5 disciplinas
        boletim.adiciona(new RegistroNota("Matemática", 8.5));
        boletim.adiciona(new RegistroNota("Português", 7.0));
        boletim.adiciona(new RegistroNota("Física", 9.0));
        boletim.adiciona(new RegistroNota("Química", 6.5));
        boletim.adiciona(new RegistroNota("História", 8.0));
 
        // Exibindo todas as disciplinas com suas notas
        System.out.println("=== Boletim de Notas ===");
        System.out.println(boletim);
 
        // Mostrando qual disciplina está em uma posição específica
        int posicao = 2;
        System.out.println("\nDisciplina na posição " + posicao + ": " + boletim.pega(posicao));
 
        // Verificando se uma disciplina está cadastrada
        RegistroNota busca1 = new RegistroNota("Física", 0);
        RegistroNota busca2 = new RegistroNota("Biologia", 0);
        System.out.println("\n'Física' está no boletim? " + boletim.contem(busca1));
        System.out.println("'Biologia' está no boletim? " + boletim.contem(busca2));
 
        // Mostrando quantos registros existem
        System.out.println("\nTotal de disciplinas no boletim: " + boletim.getTamanho());
    }
}

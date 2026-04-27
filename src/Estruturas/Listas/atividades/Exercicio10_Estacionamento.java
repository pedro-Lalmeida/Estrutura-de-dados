package Estruturas.Listas.atividades;

import Estruturas.Listas.LinkedList;

public class Exercicio10_Estacionamento {
    static class Carro {
        String placa;
        String modelo;
 
        public Carro(String placa, String modelo) {
            this.placa = placa;
            this.modelo = modelo;
        }
 
        @Override
        public String toString() {
            return "Carro{placa='" + placa + "', modelo='" + modelo + "'}";
        }
    }
 
    public static void main(String[] args) {
 
        LinkedList<Carro> estacionamento = new LinkedList<>();
 
        // Adicionando 5 carros
        estacionamento.adiciona(new Carro("ABC-1234", "Fiat Uno"));
        estacionamento.adiciona(new Carro("DEF-5678", "Volkswagen Gol"));
        estacionamento.adiciona(new Carro("GHI-9012", "Chevrolet Onix"));
        estacionamento.adiciona(new Carro("JKL-3456", "Toyota Corolla"));
        estacionamento.adiciona(new Carro("MNO-7890", "Honda Civic"));
 
        // Exibindo todos os carros estacionados
        System.out.println("=== Estacionamento ===");
        System.out.println(estacionamento);
 
        // Verificando se um carro de placa específica está na lista
        Carro busca1 = new Carro("GHI-9012", ""); // Chevrolet Onix
        Carro busca2 = new Carro("ZZZ-9999", ""); // Não está
        System.out.println("\nCarro com placa 'GHI-9012' está estacionado? " + estacionamento.contem(busca1));
        System.out.println("Carro com placa 'ZZZ-9999' está estacionado? " + estacionamento.contem(busca2));
 
        // Exibindo o primeiro e o último carro estacionados
        System.out.println("\nPrimeiro carro estacionado: " + estacionamento.pegaPrimeiro());
        System.out.println("Último carro estacionado: " + estacionamento.pegaUltimo());
    }
}

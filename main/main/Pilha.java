package main;

public class Pilha {
    
        private String[] elementos;
        private int tamanho;

        public Pilha(int capacidade) {
            this.elementos = new String[capacidade];
            this.tamanho = 0;
        }

        public boolean estaVazia(){
            return this.tamanho == 0;
        }

        public boolean empilha(String elemento){
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            } else {
                System.out.println("Erro: A pilha está cheia!");
            } 
            return false;
        }

        public String desempilha() {
            if (estaVazia()){
                return null;
            }
            String removido = this.elementos[tamanho-1];
            this.elementos[tamanho-1] = null;
            tamanho--;
            return removido;
        }

        public String topo(){
            return this.elementos[tamanho-1];
        }

        public int tamanho(){
            return tamanho;
        }

        public String toString(){
            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i = 0; i < this.tamanho; i++) {
                s.append(this.elementos[i]);
                if (i < this.tamanho-1) {
                    s.append(", ");
                }
            }

            s.append("]");
            return s.toString();
        }
}

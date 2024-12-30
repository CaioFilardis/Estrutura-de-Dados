package Avetores.dominio;

public class VerificarExistenciaElementoVetor {

    private String[] elementos;
    private int tamanho;

    public VerificarExistenciaElementoVetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    public boolean adicionar01(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    // obter posição de um vetor
    public  String busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao inválida"); // personalisanod nossa exceção
        } else {
            return this.elementos[posicao];
        }
    }

    // verificar a existência de elementos no vetor
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // verificar o tamanho do array
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        // concatenar strings
        StringBuilder s = new StringBuilder();
        s.append("["); // adiciona uma string
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}

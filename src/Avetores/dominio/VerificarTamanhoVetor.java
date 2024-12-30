package Avetores.dominio;

import java.util.Arrays;

public class VerificarTamanhoVetor {

    private String[] elementos;
    private int tamanho;

    public VerificarTamanhoVetor(int capacidade) {
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

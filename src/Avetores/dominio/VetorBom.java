package Avetores.dominio;

// ALGORITMO BOM

public class VetorBom {

    private String[] elementos;
    private int controlaTamanho;

    public VetorBom(int capacidade) {
        this.elementos = new String[capacidade];
    }

    // Adiocnar elemento no vetor
    public void adicionar(String elemento) throws Exception {
        if (this.controlaTamanho < this.elementos.length) {
            this.elementos[this.controlaTamanho] = elemento;
            this.controlaTamanho++;
        } else {
            throw new Exception("Vetor está cheio");
        }
    }

    public boolean adicionar01(String elemento) {
        if (this.controlaTamanho < this.elementos.length) {
            this.elementos[this.controlaTamanho] = elemento;
            this.controlaTamanho++;
            return true;
        } else {
            return false;
        }
    }
}


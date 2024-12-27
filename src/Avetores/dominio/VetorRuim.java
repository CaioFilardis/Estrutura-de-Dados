package Avetores.dominio;

public class VetorRuim {

    private String[] elementos;
    private int controlarTamanho;

    public VetorRuim(int capacidade) {
        this.elementos = new String[capacidade]; // determinar o tamanho do vetor
    }

    public VetorRuim(String[] elementos, int controlarTamanho) {
        this.elementos = elementos;
        this.controlarTamanho = controlarTamanho;
    }

    // Adicionar elementos no vetor, #algoritmo ruim
    public void adicionar01(String elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }

}

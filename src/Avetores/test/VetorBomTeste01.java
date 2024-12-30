package Avetores.test;

import Avetores.dominio.VetorBom;

public class VetorBomTeste01 {

    public static void main(String[] args) {
        VetorBom vetor = new VetorBom(5);

        try {
            vetor.adicionar("Caio");
            vetor.adicionar("Santos");
            vetor.adicionar("Filardis");
        } catch (Exception e) {
            e.printStackTrace();
        }

        vetor.adicionar01("Sim");
        vetor.adicionar01("Não");
        vetor.adicionar01("Talvez");


    }
}

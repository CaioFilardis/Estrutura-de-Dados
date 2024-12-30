package Avetores.test;

import Avetores.dominio.VerificarExistenciaElementoVetor;

public class VerificarExistenciaElementosVetorTest01 {

    public static void main(String[] args) {
        VerificarExistenciaElementoVetor vetor = new VerificarExistenciaElementoVetor(10);
        vetor.adicionar01("elemento 01");
        vetor.adicionar01("Elemento 02");
        vetor.adicionar01("elemento 03");

        System.out.println(vetor.busca("elemento 03"));
        System.out.println(vetor.busca("elemento 04"));
    }
}

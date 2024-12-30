package Avetores.test;

import Avetores.dominio.VerificarTamanhoVetor;

public class VerificarTamanhoVetorTest01 {

    public static void main(String[] args) {
        VerificarTamanhoVetor verificarTamanhoVetor = new VerificarTamanhoVetor(10);
        verificarTamanhoVetor.adicionar01("elemento01");
        verificarTamanhoVetor.adicionar01("elemento02");
        verificarTamanhoVetor.adicionar01("elemento03");

        System.out.println("Tamanho: "+verificarTamanhoVetor.tamanho());
        System.out.println(verificarTamanhoVetor);
    }
}

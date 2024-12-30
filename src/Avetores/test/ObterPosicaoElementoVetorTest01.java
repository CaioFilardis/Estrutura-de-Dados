package Avetores.test;

import Avetores.dominio.ObterPosicaoElementoVetor;

public class ObterPosicaoElementoVetorTest01 {

    public static void main(String[] args) {
        ObterPosicaoElementoVetor posicao = new ObterPosicaoElementoVetor(10);

        posicao.adicionar01("elemento 01");
        posicao.adicionar01("elemento 02");
        posicao.adicionar01("elemento 03");

        // System.out.println(posicao.busca(15)); // dará uma exceção
        System.out.println(posicao.busca(2));

    }
}

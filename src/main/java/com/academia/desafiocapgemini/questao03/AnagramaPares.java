package com.academia.desafiocapgemini.questao03;

import java.util.Arrays;

public class AnagramaPares {

    private int qtdPares;

    public int capturarAnagramas(String palavra) {
        String[]lista = palavra.split("");
        String[]lista2 = lista.clone();
        Arrays.sort(lista2);
        int decrementador = lista.length-1;

        for (int i = 0; i < lista2.length-1; i++) {
            if (lista2[i].equals(lista2[i+1])) {
                this.qtdPares++;
            }
            if (lista[0].equals(lista[decrementador])) {
                this.qtdPares++;
            }
            decrementador--;
        }

        return qtdPares;
    }

}

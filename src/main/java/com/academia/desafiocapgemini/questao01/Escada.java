package com.academia.desafiocapgemini.questao01;


import lombok.AllArgsConstructor;
import lombok.Data;
;import java.util.ArrayList;
import java.util.Arrays;

@Data
@AllArgsConstructor
public class Escada {

    private int quantidadeDeDegraus;

    public String montarEscada() {
        String degraus = "";
        for (int i = 0; i <= quantidadeDeDegraus; i++) {
            for (int j = 0; j < i; j++) {
                degraus += "*";

            }
            degraus +="\n";
        }

        return degraus;
    }

    public String[] montar() {
        String espaco = " ";
        String degrau = "*";
        String[]escada = new String[quantidadeDeDegraus];
        for (int i = 1; i < quantidadeDeDegraus+1; i++){
            escada[i-1] = espaco.repeat(quantidadeDeDegraus - i);
            escada[i-1] += degrau.repeat(quantidadeDeDegraus - (quantidadeDeDegraus - i));
        }
        return escada;
    }

}

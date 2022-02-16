package com.academia.desafiocapgemini.questao02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VerificadorDeSenha {

    private String senha;

    public String resultado(){
        return verificar() ? "Senha segura suficiente!" : "Senha apresenta fragilidade! é necessário adicionar mais "+ infoSenhaSegura()+" caracteres.";
    }

    private boolean verificar() {
        if (!senha.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,}")){
            return false;
        }

        return true;
    }

    private int infoSenhaSegura(){
        return (senha.length() < 6) ? 6 - senha.length() : 0;
    }


}

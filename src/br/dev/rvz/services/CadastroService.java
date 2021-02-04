package br.dev.rvz.services;

import br.dev.rvz.model.Nomes;
import br.dev.rvz.controllers.OI;

public class CadastroService {

    public static void showCastrado(Nomes cadastroNomes) {
        if (cadastroNomes.getTipoNome().equalsIgnoreCase("cachorro")) {
            cadastroNomes.cachorroFaz();
        } else if (cadastroNomes.getTipoNome().equalsIgnoreCase("gato")) {
            cadastroNomes.gatoFaz();
        } else if (cadastroNomes.getTipoNome().equalsIgnoreCase("galo")) {
            cadastroNomes.galoFaz();
        } else if (cadastroNomes.getTipoNome().equalsIgnoreCase("praia")) {
            cadastroNomes.vamosPraia();
        } else {
            OI.out("tipo de cadastro inválido");
        }
    }

}

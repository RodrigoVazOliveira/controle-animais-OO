package br.dev.rvz;

import br.dev.rvz.main.MainMenu;
import br.dev.rvz.model.Nomes;
import br.dev.rvz.services.CadastroService;
import br.dev.rvz.controllers.OI;

public class Main {

    public static void main(String[] args) {
        MainMenu.show();
        Nomes cadastroNomes = new Nomes();
        cadastroNomes.setTipoNome(OI.input().nextLine());
        cadastroNomes.setNome(MainMenu.inputName());
        CadastroService.showCastrado(cadastroNomes);
    }
}

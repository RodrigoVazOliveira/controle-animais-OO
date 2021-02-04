package br.dev.rvz.main;

import br.dev.rvz.controllers.OI;

public class MainMenu {
    public static void show() {
        OI.out("Bem vindo ao programa de bichos e prais\n" +
                "Quer cadastrar:\n" +
                "Nome de cachorro.  \n" +
                "Nome de gato.\n" +
                "Nome de galo.\n" +
                "Nome de praia favorita.");
    }

    public static String inputName() {
        OI.out("Digite o nome: ");
        return OI.input().next();
    }
}

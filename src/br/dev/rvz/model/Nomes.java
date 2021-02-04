package br.dev.rvz.model;

import br.dev.rvz.controllers.OI;

public class Nomes {

    private String nome;
    private String tipoNome;

    public Nomes() {
    }

    public String getTipoNome() {
        return tipoNome;
    }

    public void setTipoNome(String tipoNome) {
        this.tipoNome = tipoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cachorroFaz() {
        OI.out("O seu cachorro se chama " + this.nome + " e faz au au.");
    }

    public void gatoFaz() {
        OI.out("Seu gato se chama " + this.nome + " e faz miau.");
    }

    public void galoFaz() {
        OI.out("Seu galo se chama " + this.nome + " e faz cocorico");
    }

    public void vamosPraia() {
        OI.out("Vamos para a praia " + this.nome + " com uma brasília amarela");
    }


}

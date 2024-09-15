package me.felipedev.HelpDesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa {

    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
    }

    public Tecnico(String nome, String cpf, String email, String senha, Integer id) {
        super(nome, cpf, email, senha, id);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}

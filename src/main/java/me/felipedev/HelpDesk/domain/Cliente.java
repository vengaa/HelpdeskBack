package me.felipedev.HelpDesk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import me.felipedev.HelpDesk.enums.Perfil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(String nome, String cpf, String email, String senha, Integer id) {
        super(nome, cpf, email, senha, id);
        addPerfil(Perfil.CLIENTE);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}

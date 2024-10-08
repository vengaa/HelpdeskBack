package me.felipedev.HelpDesk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import me.felipedev.HelpDesk.enums.Perfil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "tecnico")
    private List<Chamado> chamados = new ArrayList<>();

    public Tecnico() {
        super();
        addPerfil(Perfil.TECNICO); // Ensure correct profile
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.TECNICO); // Ensure correct profile
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}

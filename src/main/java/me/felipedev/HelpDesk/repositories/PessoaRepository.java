package me.felipedev.HelpDesk.repositories;

import me.felipedev.HelpDesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}

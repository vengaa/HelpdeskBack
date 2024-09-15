package me.felipedev.HelpDesk.repositories;

import me.felipedev.HelpDesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

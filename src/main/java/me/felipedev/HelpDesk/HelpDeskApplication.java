package me.felipedev.HelpDesk;

import me.felipedev.HelpDesk.domain.Chamado;
import me.felipedev.HelpDesk.domain.Cliente;
import me.felipedev.HelpDesk.domain.Tecnico;
import me.felipedev.HelpDesk.enums.Perfil;
import me.felipedev.HelpDesk.enums.Prioridade;
import me.felipedev.HelpDesk.enums.Status;
import me.felipedev.HelpDesk.repositories.ChamadoRepository;
import me.felipedev.HelpDesk.repositories.ClienteRepository;
import me.felipedev.HelpDesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpDeskApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tecnico tec1 = new Tecnico(null, "Felipe Lima", "12345678900", "felipelima@mail.com", "1234");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Cliente 1", "013987456980", "Clie1@mail.com", "1234");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Chamados de Teste", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

	}
}

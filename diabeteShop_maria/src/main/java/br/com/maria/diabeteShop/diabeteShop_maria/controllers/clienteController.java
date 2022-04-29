package br.com.maria.diabeteShop.diabeteShop_maria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.maria.diabeteShop.diabeteShop_maria.model.cliente;
import br.com.maria.diabeteShop.diabeteShop_maria.repositories.clienteRepository;

@Controller
@RequestMapping("/")
public class clienteController {
	@Autowired
	clienteRepository clienteRepo;

	clienteController(clienteRepository clienteR) {
		this.clienteRepo = clienteR;
	}

	@GetMapping
	public String index() {
		return "index.html";
	}

	@GetMapping("/listarCliente")
	public String listarCliente() {
		List<cliente> todosOsClientes = clienteRepo.findAll();
		ModelAndView modelAndView = new ModelAndView("listarCliente");
		modelAndView.addObject("todosOsClientes", todosOsClientes);

		return "listarCliente.html";
	}

	@GetMapping("/adicionarCliente")
	public String adicionarCliente() {
		List<cliente> todosOsClientes = clienteRepo.findAll();

		ModelAndView modelAndView = new ModelAndView("adicionarCliente");
		modelAndView.addObject("todosOsClientes", todosOsClientes);

		return "adicionarCliente.html";
	}
}
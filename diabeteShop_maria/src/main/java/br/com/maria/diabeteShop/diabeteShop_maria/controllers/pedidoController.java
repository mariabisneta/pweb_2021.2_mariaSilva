package br.com.maria.diabeteShop.diabeteShop_maria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.maria.diabeteShop.diabeteShop_maria.model.pedidos;
import br.com.maria.diabeteShop.diabeteShop_maria.repositories.pedidosRepository;

@Controller
@RequestMapping("/")
public class pedidoController {
    
	@Autowired
	pedidosRepository pedidoRepo;

	pedidoController(pedidosRepository pedidoR) {
		this.pedidoRepo = pedidoR;
	}

	@GetMapping
	public String index() {
		return "index.html";
	}

	@GetMapping("/pedidos")
	public String pedidos() {
		List<pedidos> todosOsPedidos = pedidoRepo.findAll();
		ModelAndView modelAndView = new ModelAndView("pedidos");
		modelAndView.addObject("todosOsPedidos", todosOsPedidos);

		return "pedidos.html";
	}
/*
algo nao esta certo aq 
	@GetMapping("/adicionarPedido")
	public String adicionarPedido() {
		List<pedidos> todosAsSacolasDeCompras = adicionarPedidoRepo.findAll();
		ModelAndView modelAndView = new ModelAndView("pedidos");
        modelAndView.addObject("todosAsSacolasDeCompras", todosAsSacolasDeCompras);

		return "adicionarPedido.html";
	}*/
}
package br.com.maria.diabeteShop.diabeteShop_maria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.maria.diabeteShop.diabeteShop_maria.model.dependente;
import br.com.maria.diabeteShop.diabeteShop_maria.repositories.dependenteRepository;

@Controller
@RequestMapping("/")
public class dependenteController {

	@Autowired
	dependenteRepository dependenteRepo;

	dependenteController(dependenteRepository dependenteR) {
		this.dependenteRepo = dependenteR;
	}

	@GetMapping
	public String index() {
		return "index.html";
	}
/* n sei se quero isso ainda
	@GetMapping("/listarDependente")
	public String listarDependente() {
		List<produto> todosOsDependentes = dependenteRepo.findAll();
		ModelAndView modelAndView = new ModelAndView("listarDependente");
		modelAndView.addObject("todosOsDependentes", todosOsDependentes);

		return "listarDependente.html";
	}*/

	@GetMapping("/adicionarDependente")
	public String adicionarDependente() {
		List<dependente> todosOsDependentes = dependenteRepo.findAll();

		ModelAndView modelAndView = new ModelAndView("adicionarDependente");
		modelAndView.addObject("todosOsDependentes", todosOsDependentes);

		return "adicionarDependente.html";
	}
    
}

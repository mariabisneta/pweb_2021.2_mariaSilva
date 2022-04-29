package br.com.maria.diabeteShop.diabeteShop_maria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.maria.diabeteShop.diabeteShop_maria.model.produto;
import br.com.maria.diabeteShop.diabeteShop_maria.repositories.produtoRepository;

@Controller
@RequestMapping("/")
public class produtoController {

	@Autowired
	produtoRepository produtoRepo;

	produtoController(produtoRepository produtoR) {
		this.produtoRepo = produtoR;
	}

	@GetMapping
	public String index() {
		return "index.html";
	}

	@GetMapping("/listarProduto")
	public String listarProduto() {
		List<produto> todosOsProduto = produtoRepo.findAll();
		ModelAndView modelAndView = new ModelAndView("listarProduto");
		modelAndView.addObject("todosOsProdutos", todosOsProduto);

		return "listarProduto.html";
	}

	@GetMapping("/adicionarProduto")
	public String adicionarProduto() {
		List<produto> todosOsProdutos = produtoRepo.findAll();

		ModelAndView modelAndView = new ModelAndView("adicionarProduto");
		modelAndView.addObject("todosOsProdutos", todosOsProdutos);

		return "adicionarProduto.html";
	}
}

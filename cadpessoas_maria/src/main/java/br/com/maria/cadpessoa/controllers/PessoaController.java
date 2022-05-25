package br.com.maria.cadpessoa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.maria.cadpessoa.model.Pessoa;
import br.com.maria.cadpessoa.repositories.PessoaRepository;

//esse controller está incompleto e errado...
@Controller
@RequestMapping("/")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepo;

	PessoaController(PessoaRepository pessoaR){
		this.pessoaRepo = pessoaR;
	}
	
	@GetMapping
	public String index() {
		return "index.html";
	}

	@GetMapping ("/listarPessoas")
	public String listarPessoas() {
		List<Pessoa> todasAsPessoas = pessoaRepo.findAll();
		
		ModelAndView modelAndView = new ModelAndView("listarPessoas");
		modelAndView.addObject("todasAsPessoas", todasAsPessoas);
		
		return "listarPessoas.html";
	}
	@GetMapping ("/adicionarPessoa")
	public String adicionarPessoa() {
		List<Pessoa> todasAsPessoas = pessoaRepo.findAll();
		
		ModelAndView modelAndView = new ModelAndView("adicionarPessoa");
		modelAndView.addObject("todasAsPessoas", todasAsPessoas);
		
		return "adicionarPessoa.html";
}
}
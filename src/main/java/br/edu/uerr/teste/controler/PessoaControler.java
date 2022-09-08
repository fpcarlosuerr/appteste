package br.edu.uerr.teste.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.uerr.teste.repositorio.PessoaRepositorio;

@Controller
public class PessoaControler {

	@Autowired
	PessoaRepositorio pessoaRepositorio;
	
	@GetMapping("/pessoas")
	public String lista(Model model) {
		model.addAttribute("listaPessoas", pessoaRepositorio.findAll());
		return "ListaPessoas";
	}
	
	
	
}

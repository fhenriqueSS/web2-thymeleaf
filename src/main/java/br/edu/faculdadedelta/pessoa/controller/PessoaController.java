package br.edu.faculdadedelta.pessoa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.faculdadedelta.pessoa.model.Pessoa;
import br.edu.faculdadedelta.pessoa.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping("/")
	public ModelAndView findAll() {
		
		ModelAndView mv = new ModelAndView("/lista");
		mv.addObject("pessoas", service.findAll());
		
		return mv;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView add(Pessoa pessoa) {
		
		ModelAndView mv = new ModelAndView("/cadastro");
		mv.addObject("pessoa", pessoa);
		
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		return add(service.findOne(id));
	}
	
	@GetMapping("/remover/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		service.delete(id);
		
		return findAll();
	}
	
	@PostMapping("/salvar")
	public ModelAndView save(@Valid Pessoa post, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(post);
		}
		
		service.save(post);
		
		return findAll();
	}
	
}

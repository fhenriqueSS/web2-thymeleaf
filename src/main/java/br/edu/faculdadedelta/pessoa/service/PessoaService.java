package br.edu.faculdadedelta.pessoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.faculdadedelta.pessoa.model.Pessoa;
import br.edu.faculdadedelta.pessoa.repository.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll() {
		return repository.findAll(); 
	}
	
	public Pessoa findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Pessoa save(Pessoa post) {
		return repository.saveAndFlush(post);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
}
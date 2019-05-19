package br.edu.faculdadedelta.pessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.faculdadedelta.pessoa.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> { } 
package br.edu.faculdadedelta.pessoa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "pessoas")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1237813221367123L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(nullable = false, length = 60)
	@NotBlank(message = "É necessário informar um nome.")
	private String nome;
	
	@Column(nullable = false, length = 60)
	@NotBlank(message = "É necessário informar um cpf.")
	private String cpf;
	
	@Column(nullable = false, length = 9)
	@NotBlank(message = "É necessário informar um telefone fixo.")
	private String telefoneFixo;
	
	@Column(nullable = false, length = 9)
	@NotBlank(message = "É necessário informar um celular.")
	private String celular;
	
	@Column(nullable = false, length = 250)
	@NotBlank(message = "É necessário informar um endereço.")
	private String endereco;

	public Pessoa() {
		super();
	}

	public Pessoa(Long id, String nome, String cpf, String telefoneFixo, String celular, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefoneFixo = telefoneFixo;
		this.celular = celular;
		this.endereco = endereco;
	}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}	

	
}

package com.Shows.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Gerenciamento de Shows")
public class Shows {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Informe o nome do Artista")
	private String nome;

	@NotNull(message = "Informe a duração do show")
	private String duração;

	@NotNull(message = "Informe o valor do Ingresso")
	private String valor;

	@NotNull(message = "Informe a classificação etária")
	private String classificação;

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

	public String getDuração() {
		return duração;
	}

	public void setDuração(String duração) {
		this.duração = duração;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getClassificação() {
		return classificação;
	}

	public void setClassificação(String classificação) {
		this.classificação = classificação;
	}

}

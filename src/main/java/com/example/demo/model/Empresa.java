package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name= "empresas")

@Entity

public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String setor;
	private String site;
	@Column(name = "vagas_afirmativas")
	private Boolean vagasAfirmativas;
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Boolean getVagasAfirmativas() {
		return vagasAfirmativas;
	}
	public void setVagasAfirmativas(Boolean vagasAfirmativas) {
		this.vagasAfirmativas = vagasAfirmativas;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}

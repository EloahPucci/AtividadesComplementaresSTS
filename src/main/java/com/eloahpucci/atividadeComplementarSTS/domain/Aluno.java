package com.eloahpucci.atividadeComplementarSTS.domain;

public class Aluno {
	
	private Long ra;
	private String nome;
	
	public Aluno() {}

	public Aluno(Long ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}

	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}

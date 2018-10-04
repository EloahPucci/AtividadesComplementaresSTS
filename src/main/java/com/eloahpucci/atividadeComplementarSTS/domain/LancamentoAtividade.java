package com.eloahpucci.atividadeComplementarSTS.domain;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LancamentoAtividade {

	private Integer codigo;
	private Integer quantidadedeHoras;
	private Date dataInicio;
	private Date dataFim;
	private Aluno aluno;
	private Atividade atividade;
	
	public String getSemestreAtividade() {
		LocalDate localDateDataFim = dataFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		if(localDateDataFim.getMonthValue() < 6) {
			return localDateDataFim.getYear() + "-1";
		}
		
		return localDateDataFim.getYear() + "-2";
	}
	
	/**public Integer getHorasAproveitadas() {
		
	}**/
	
	public LancamentoAtividade() {}

	public LancamentoAtividade(Integer codigo, Integer quantidadedeHoras, Date dataInicio, Date dataFim, Aluno aluno,
			Atividade atividade) {
		super();
		this.codigo = codigo;
		this.quantidadedeHoras = quantidadedeHoras;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.aluno = aluno;
		this.atividade = atividade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidadedeHoras() {
		return quantidadedeHoras;
	}

	public void setQuantidadedeHoras(Integer quantidadedeHoras) {
		this.quantidadedeHoras = quantidadedeHoras;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}	
}

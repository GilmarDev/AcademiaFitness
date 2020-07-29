package com.academiafitness.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modalidades")
public class Modalidades{

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long codigo;
	
	@Column(name = "nome_modalidades")
	private String nomeModalidade;
	
	
	@Column(name = "horario")
	private String horario;
	
	@Column(name = "data_modalidade")
	private String dataModalidade;
	
	
	@Column(name = "professor")
	private String professor;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNomeModalidade() {
		return nomeModalidade;
	}

	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDataModalidade() {
		return dataModalidade;
	}

	public void setDataModalidade(String dataModalidade) {
		this.dataModalidade = dataModalidade;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		result = prime * result + ((dataModalidade == null) ? 0 : dataModalidade.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + ((nomeModalidade == null) ? 0 : nomeModalidade.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
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
		Modalidades other = (Modalidades) obj;
		if (codigo != other.codigo)
			return false;
		if (dataModalidade == null) {
			if (other.dataModalidade != null)
				return false;
		} else if (!dataModalidade.equals(other.dataModalidade))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (nomeModalidade == null) {
			if (other.nomeModalidade != null)
				return false;
		} else if (!nomeModalidade.equals(other.nomeModalidade))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}
	
	
}





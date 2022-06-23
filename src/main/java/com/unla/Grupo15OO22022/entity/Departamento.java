package com.unla.Grupo15OO22022.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartamento;

	@Column(name = "departamento")
	private String departamento;

	public Departamento() {
	}

	public Departamento(String departamento) {
		this.departamento = departamento;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	protected void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", departamento=" + departamento + "]";
	}

}

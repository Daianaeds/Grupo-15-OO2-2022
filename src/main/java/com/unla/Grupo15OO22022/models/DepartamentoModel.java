package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class DepartamentoModel {

	private int idDepartamento;
	private String departamento;

	public DepartamentoModel() {
		super();
	}

	public DepartamentoModel(String departamento) {
		super();
		this.departamento = departamento;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
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
		return "DepartamentoModel [idDepartamento=" + idDepartamento + ", departamento=" + departamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departamento, idDepartamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartamentoModel other = (DepartamentoModel) obj;
		return Objects.equals(departamento, other.departamento) && idDepartamento == other.idDepartamento;
	}

}

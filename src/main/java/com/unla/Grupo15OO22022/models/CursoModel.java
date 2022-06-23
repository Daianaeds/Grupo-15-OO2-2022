package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class CursoModel {

	private String codCurso;

	public CursoModel() {
		super();
	}

	public CursoModel(String codCurso) {
		super();
		this.codCurso = codCurso;
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	@Override
	public String toString() {
		return "CursoModel [codCurso=" + codCurso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursoModel other = (CursoModel) obj;
		return Objects.equals(codCurso, other.codCurso);
	}
	
	
}

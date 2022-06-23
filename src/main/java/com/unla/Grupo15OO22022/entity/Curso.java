package com.unla.Grupo15OO22022.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
@PrimaryKeyJoinColumn(referencedColumnName="idNotaPedido", name= "id_curso") 
public class Curso extends NotaPedido {

	@Column(name = "codigo_curso")
	private String codCurso;

	public Curso() {
		super();
	}

	public Curso(String codCurso) {
		super();
		this.codCurso = codCurso;
	}

	public Curso(LocalDate fecha, char turno, Aula aula, char tipoAula, int cantEstudiantes, Materia materia,
			String observaciones) {
		super(fecha, turno, aula, cantEstudiantes, materia, observaciones);
		// TODO Auto-generated constructor stub
	}

	public String getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + "]";
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
		Curso other = (Curso) obj;
		return Objects.equals(codCurso, other.codCurso);
	}

}

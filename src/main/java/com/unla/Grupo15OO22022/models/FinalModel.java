package com.unla.Grupo15OO22022.models;

import java.time.LocalDate;
import java.util.Objects;

public class FinalModel extends NotaPedidoModel{
	
	private LocalDate fechaFinal;

	public FinalModel() {
		super();
	}


	public FinalModel(LocalDate fecha, char turno, AulaModel aula, char tipoAula, int cantEstudiantes,
			MateriaModel materia, String observaciones) {
		super(fecha, turno, aula, tipoAula, cantEstudiantes, materia, observaciones);
		// TODO Auto-generated constructor stub
	}


	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	@Override
	public String toString() {
		return "FinalModel [fechaFinal=" + fechaFinal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaFinal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinalModel other = (FinalModel) obj;
		return Objects.equals(fechaFinal, other.fechaFinal);
	}
	
	

}

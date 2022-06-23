package com.unla.Grupo15OO22022.models;

import java.time.LocalDate;
import java.util.Objects;

public class EspacioModel {
	
	private int idEspacio;
	private LocalDate fecha;
	private char turno;
	private AulaModel aula;
	private boolean libre;
	public EspacioModel() {
		super();
	}
	public EspacioModel(LocalDate fecha, char turno, AulaModel aula, boolean libre) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
		this.libre = libre;
	}
	public int getIdEspacio() {
		return idEspacio;
	}
	public void setIdEspacio(int idEspacio) {
		this.idEspacio = idEspacio;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	public AulaModel getAula() {
		return aula;
	}
	public void setAula(AulaModel aula) {
		this.aula = aula;
	}
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	@Override
	public String toString() {
		return "EspacioModel [idEspacio=" + idEspacio + ", fecha=" + fecha + ", turno=" + turno + ", aula=" + aula
				+ ", libre=" + libre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aula, fecha, idEspacio, libre, turno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EspacioModel other = (EspacioModel) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(fecha, other.fecha) && idEspacio == other.idEspacio
				&& libre == other.libre && turno == other.turno;
	}

	

}

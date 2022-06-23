package com.unla.Grupo15OO22022.models;

import java.time.LocalDate;
import java.util.Objects;

public class NotaPedidoModel {

	protected int idNotaPedido;
	protected LocalDate fecha;
	protected char turno;
	protected AulaModel aula;
	protected char tipoAula;
	protected int cantEstudiantes;
	protected MateriaModel materia;
	protected String observaciones;

	public NotaPedidoModel() {
		super();
	}

	public NotaPedidoModel(LocalDate fecha, char turno, AulaModel aula, char tipoAula, int cantEstudiantes,
			MateriaModel materia, String observaciones) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
		this.tipoAula = tipoAula;
		this.cantEstudiantes = cantEstudiantes;
		this.materia = materia;
		this.observaciones = observaciones;
	}

	public int getIdNotaPedido() {
		return idNotaPedido;
	}

	public void setIdNotaPedido(int idNotaPedido) {
		this.idNotaPedido = idNotaPedido;
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

	public char getTipoAula() {
		return tipoAula;
	}

	public void setTipoAula(char tipoAula) {
		this.tipoAula = tipoAula;
	}

	public int getCantEstudiantes() {
		return cantEstudiantes;
	}

	public void setCantEstudiantes(int cantEstudiantes) {
		this.cantEstudiantes = cantEstudiantes;
	}

	public MateriaModel getMateria() {
		return materia;
	}

	public void setMateria(MateriaModel materia) {
		this.materia = materia;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "NotaPedidoModel [idNotaPedido=" + idNotaPedido + ", fecha=" + fecha + ", turno=" + turno + ", tipoAula="
				+ tipoAula + ", cantEstudiantes=" + cantEstudiantes + ", observaciones=" + observaciones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aula, cantEstudiantes, fecha, idNotaPedido, materia, observaciones, tipoAula, turno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotaPedidoModel other = (NotaPedidoModel) obj;
		return Objects.equals(aula, other.aula) && cantEstudiantes == other.cantEstudiantes
				&& Objects.equals(fecha, other.fecha) && idNotaPedido == other.idNotaPedido
				&& Objects.equals(materia, other.materia) && Objects.equals(observaciones, other.observaciones)
				&& tipoAula == other.tipoAula && turno == other.turno;
	}

}

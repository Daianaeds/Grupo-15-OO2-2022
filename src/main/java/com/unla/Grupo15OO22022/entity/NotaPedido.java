package com.unla.Grupo15OO22022.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "nota_pedido")
@Inheritance(strategy=InheritanceType.JOINED)
public class NotaPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idNotaPedido;

	@Column(name = "fecha")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected LocalDate fecha;

	@Column(name = "turno")
	protected char turno;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aula_id")
	protected Aula aula;

	@Column(name = "cant_estudiantes")
	protected int cantEstudiantes;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idMateria")
	protected Materia materia;

	@Column(name = "observaciones")
	protected String observaciones;

	public NotaPedido() {
	}

	public NotaPedido(LocalDate fecha, char turno, Aula aula, int cantEstudiantes, Materia materia,
			String observaciones) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
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

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public int getCantEstudiantes() {
		return cantEstudiantes;
	}

	public void setCantEstudiantes(int cantEstudiantes) {
		this.cantEstudiantes = cantEstudiantes;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
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
		return "NotaPedido [idNotaPedido=" + idNotaPedido + ", fecha=" + fecha + ", turno=" + turno + ", aula=" + aula
				+ ", cantEstudiantes=" + cantEstudiantes + ", materia=" + materia + ", observaciones=" + observaciones
				+ "]";
	}







	

}
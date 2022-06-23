package com.unla.Grupo15OO22022.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "final")
@PrimaryKeyJoinColumn(referencedColumnName="idNotaPedido", name= "id_final") 
public class Final extends NotaPedido {

	@Column(name = "fecha_final")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaFinal;

	public Final() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Final(LocalDate fecha, char turno, Aula aula, char tipoAula, int cantEstudiantes, Materia materia,
			String observaciones) {
		super(fecha, turno, aula, cantEstudiantes, materia, observaciones);
		// TODO Auto-generated constructor stub
	}

	public Final(LocalDate fechaFinal) {
		super();
		this.fechaFinal = fechaFinal;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}

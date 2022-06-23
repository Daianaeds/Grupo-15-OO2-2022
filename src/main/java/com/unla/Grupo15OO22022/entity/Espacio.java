package com.unla.Grupo15OO22022.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "espacio")
public class Espacio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEspacio;

	@Column(name = "fecha")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;

	@Column(name = "turno")
	private char turno;

	@ManyToOne(fetch = FetchType.LAZY) //trae un solo aula
	@JoinColumn(name = "idAula")
	private Aula aula;

	@Column(name = "libre")
	private boolean libre;

	public Espacio() {
		super();
	}

	public Espacio(LocalDate fecha, char turno, Aula aula, boolean libre) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
		this.libre = libre;
	}

	public int getIdEspacio() {
		return idEspacio;
	}

	protected void setIdEspacio(int idEspacio) {
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

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
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
		return "Espacio [id=" + idEspacio + ", fecha=" + fecha + ", turno=" + turno + ", aula=" + aula + ", libre=" + libre
				+ "]";
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
		Espacio other = (Espacio) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(fecha, other.fecha) && idEspacio == other.idEspacio
				&& libre == other.libre && turno == other.turno;
	}

}

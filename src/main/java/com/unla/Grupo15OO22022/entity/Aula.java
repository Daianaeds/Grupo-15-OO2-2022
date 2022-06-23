package com.unla.Grupo15OO22022.entity;

import java.util.Objects;

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

@Entity
@Table(name = "aula")
@Inheritance(strategy=InheritanceType.JOINED)
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idAula;

	@Column(name = "numero")
	protected int numero;

	@ManyToOne(fetch = FetchType.LAZY) //cuando tiene bidireccional, lazy trae un solo edificio
	@JoinColumn(name = "idEdificio")
	protected Edificio edificio;

	public Aula() {
		super();
	}

	public Aula(int numero, Edificio edificio) {
		super();
		this.numero = numero;
		this.edificio = edificio;
	}

	public int getIdAula() {
		return idAula;
	}

	protected void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}



	@Override
	public String toString() {
		return "Aula [idAula=" + idAula + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAula, numero);
	}

	@Override
	public boolean equals(Object obj) {
		return ((Aula) obj).getIdAula() == this.getIdAula();
	}

}

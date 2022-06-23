package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class AulaModel {

	protected int idAula;
	protected int numero;
	protected EdificioModel edificio;

	public AulaModel() {
		super();
	}

	public AulaModel(int numero, EdificioModel edificio) {
		super();
		this.numero = numero;
		this.edificio = edificio;
	}

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public EdificioModel getEdificio() {
		return edificio;
	}

	public void setEdificio(EdificioModel edificio) {
		this.edificio = edificio;
	}



	@Override
	public String toString() {
		return "AulaModel [idAula=" + idAula + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAula, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AulaModel other = (AulaModel) obj;
		return Objects.equals(edificio, other.edificio) && idAula == other.idAula && numero == other.numero;
	}
	
	

}

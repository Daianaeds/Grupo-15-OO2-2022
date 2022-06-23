package com.unla.Grupo15OO22022.models;

import java.util.Objects;
import java.util.Set;

public class EdificioModel {

	private int idEdificio;
	private String edificio;
	private Set<AulaModel> aula;

	public EdificioModel() {
		super();
	}

	public EdificioModel(String edificio, Set<AulaModel> aula) {
		super();
		this.edificio = edificio;
		this.aula = aula;
	}

	public int getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Set<AulaModel> getAula() {
		return aula;
	}

	public void setAula(Set<AulaModel> aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "EdificioModel [idEdificio=" + idEdificio + ", edificio=" + edificio + ", aula=" + aula + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(aula, edificio, idEdificio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdificioModel other = (EdificioModel) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(edificio, other.edificio)
				&& idEdificio == other.idEdificio;
	}

}

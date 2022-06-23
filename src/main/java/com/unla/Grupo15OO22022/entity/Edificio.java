package com.unla.Grupo15OO22022.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "edificio")
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEdificio;

	@Column(name = "edificio")
	private String edificio;
	
	@OneToMany(mappedBy = "edificio", fetch = FetchType.LAZY) //trae un solo aula
	private Set<Aula> aula;

	public Edificio() {
		super();
	}

	public Edificio(String edificio, Set<Aula> aula) {
		super();
		this.edificio = edificio;
		this.aula = aula;
	}

	public int getIdEdificio() {
		return idEdificio;
	}

	protected void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Set<Aula> getAula() {
		return aula;
	}

	public void setAula(Set<Aula> aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Edificio [getClass()=" + getClass() + ", id=" + idEdificio + ", edificio=" + edificio + ", aula=" + aula + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(aula, edificio, idEdificio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edificio other = (Edificio) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(edificio, other.edificio) && idEdificio == other.idEdificio;
	}

}

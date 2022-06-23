package com.unla.Grupo15OO22022.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tradicional")
@PrimaryKeyJoinColumn(referencedColumnName="idAula", name= "id_tradicional") 
public class Tradicional extends Aula {

	@Column(name = "cantidad_bancos")
	private int cantBancos;

	@Column(name = "pizarron")
	private String pizarron;

	@Column(name = "tiene_proyectos")
	private boolean tieneProyectos;

	public Tradicional() {
		super();
	}

	public Tradicional(int cantBancos, String pizarron, boolean tieneProyectos) {
		super();
		this.cantBancos = cantBancos;
		this.pizarron = pizarron;
		this.tieneProyectos = tieneProyectos;
	}

	public Tradicional(int numero, Edificio edificio) {
		super(numero, edificio);
		// TODO Auto-generated constructor stub
	}

	public int getCantBancos() {
		return cantBancos;
	}

	public void setCantBancos(int cantBancos) {
		this.cantBancos = cantBancos;
	}

	public String getPizarron() {
		return pizarron;
	}

	public void setPizarron(String pizarron) {
		this.pizarron = pizarron;
	}

	public boolean isTieneProyectos() {
		return tieneProyectos;
	}

	public void setTieneProyectos(boolean tieneProyectos) {
		this.tieneProyectos = tieneProyectos;
	}

	@Override
	public String toString() {
		return "Tradicional [cantBancos=" + cantBancos + ", pizarron=" + pizarron + ", tieneProyectos=" + tieneProyectos
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantBancos, pizarron, tieneProyectos);
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
		Tradicional other = (Tradicional) obj;
		return cantBancos == other.cantBancos && Objects.equals(pizarron, other.pizarron)
				&& tieneProyectos == other.tieneProyectos;
	}

}

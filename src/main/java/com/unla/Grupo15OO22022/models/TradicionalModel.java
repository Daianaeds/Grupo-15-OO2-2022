package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class TradicionalModel {

	private int cantBancos;
	private String pizarron;
	private boolean tieneProyectos;

	public TradicionalModel() {
		super();
	}

	public TradicionalModel(int cantBancos, String pizarron, boolean tieneProyectos) {
		super();
		this.cantBancos = cantBancos;
		this.pizarron = pizarron;
		this.tieneProyectos = tieneProyectos;
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
		return "TradicionalModel [cantBancos=" + cantBancos + ", pizarron=" + pizarron + ", tieneProyectos="
				+ tieneProyectos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantBancos, pizarron, tieneProyectos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradicionalModel other = (TradicionalModel) obj;
		return cantBancos == other.cantBancos && Objects.equals(pizarron, other.pizarron)
				&& tieneProyectos == other.tieneProyectos;
	}

}

package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class LaboratorioModel {

	private int cantPc;
	private int cantSillas;

	public LaboratorioModel() {
		super();
	}

	public LaboratorioModel(int cantPc, int cantSillas) {
		super();
		this.cantPc = cantPc;
		this.cantSillas = cantSillas;
	}

	public int getCantPc() {
		return cantPc;
	}

	public void setCantPc(int cantPc) {
		this.cantPc = cantPc;
	}

	public int getCantSillas() {
		return cantSillas;
	}

	public void setCantSillas(int cantSillas) {
		this.cantSillas = cantSillas;
	}

	@Override
	public String toString() {
		return "LaboratorioModel [cantPc=" + cantPc + ", cantSillas=" + cantSillas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantPc, cantSillas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaboratorioModel other = (LaboratorioModel) obj;
		return cantPc == other.cantPc && cantSillas == other.cantSillas;
	}

}

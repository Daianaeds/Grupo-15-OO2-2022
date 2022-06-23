package com.unla.Grupo15OO22022.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "laboratorio")
@PrimaryKeyJoinColumn(referencedColumnName="idAula", name= "id_laboratorio") 
public class Laboratorio extends Aula {

	@Column(name = "cantidad_pc")
	private int cantPc;

	@Column(name = "cantidad_sillas")
	private int cantSillas;

	public Laboratorio() {
		super();
	}

	public Laboratorio(int cantPc, int cantSillas) {
		super();
		this.cantPc = cantPc;
		this.cantSillas = cantSillas;
	}

	public Laboratorio(int numero, Edificio edificio) {
		super(numero, edificio);
		// TODO Auto-generated constructor stub
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
		return "Laboratorio [cantPc=" + cantPc + ", cantSillas=" + cantSillas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantPc, cantSillas);
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
		Laboratorio other = (Laboratorio) obj;
		return cantPc == other.cantPc && cantSillas == other.cantSillas;
	}

}

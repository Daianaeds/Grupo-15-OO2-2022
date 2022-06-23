package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class MateriaModel {

	private int idMateria;
	private int codMateria;
	private String materia;
	private CarreraModel carrera;

	public MateriaModel() {}

	public MateriaModel(int codMateria, String materia, CarreraModel carrera) {
        super();
        this.codMateria = codMateria;
        this.materia = materia;
        this.carrera = carrera;
    }

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public int getCodMateria() {
		return codMateria;
	}

	public void setCodMateria(int codMateria) {
		this.codMateria = codMateria;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public CarreraModel getCarrera() {
		return carrera;
	}

	public void setCarrera(CarreraModel carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Materia [idMateria=" + idMateria + ", codMateria=" + codMateria + ", materia=" + materia + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carrera, codMateria, idMateria, materia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MateriaModel other = (MateriaModel) obj;
		return Objects.equals(carrera, other.carrera) && codMateria == other.codMateria && idMateria == other.idMateria
				&& Objects.equals(materia, other.materia);
	}
	
	

}

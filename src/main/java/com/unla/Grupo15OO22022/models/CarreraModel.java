package com.unla.Grupo15OO22022.models;

import java.util.Objects;

public class CarreraModel {

	private int idCarrera;
	private String carrera;
	private DepartamentoModel departamento;

	public CarreraModel() {
		super();
	}

	public CarreraModel(String carrera, DepartamentoModel departamento) {
		super();
		this.carrera = carrera;
		this.departamento = departamento;
	}

	public int getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public DepartamentoModel getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoModel departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "CarreraModel [idCarrera=" + idCarrera + ", carrera=" + carrera + ", departamento=" + departamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCarrera);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarreraModel other = (CarreraModel) obj;
		return idCarrera == other.idCarrera;
	}

}

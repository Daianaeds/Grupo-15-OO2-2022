package com.unla.Grupo15OO22022.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrera")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarrera;
	
	@Column(name = "carrera")
    private String carrera;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "idDepartamento")
    private Departamento departamento;

    public Carrera() {}

    public Carrera(String carrera, Departamento departamento) {
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Carrera [idCarrera=" + idCarrera + ", carrera=" + carrera + "]";
    }

}

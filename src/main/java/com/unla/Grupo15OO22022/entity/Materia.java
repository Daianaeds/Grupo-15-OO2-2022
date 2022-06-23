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
@Table(name = "materia")
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateria;
	
	@Column(name = "codigo_materia")
    private int codMateria;
	
	@Column(name = "materia")
    private String materia;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "idCarrera")
    private Carrera carrera;

    public Materia() {}

    public Materia(int codMateria, String materia, Carrera carrera) {
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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Materia [idMateria=" + idMateria + ", codMateria=" + codMateria + ", materia=" + materia + "]";
    }

}

package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.entity.Departamento;
import com.unla.Grupo15OO22022.models.DepartamentoModel;

public interface IDepartamentoService {
	
	public List<DepartamentoModel> GetAll();
//	public Departamento insertOrUpdate(DepartamentoModel departamento);
	public void delete(int idDepartamento );
	public Departamento findById(int id);
	Departamento save(Departamento departamento);
	Departamento update(DepartamentoModel departamento);
	public Departamento crear(DepartamentoModel departamento);

}

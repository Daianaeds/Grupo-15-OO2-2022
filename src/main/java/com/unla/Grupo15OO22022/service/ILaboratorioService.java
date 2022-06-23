package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.models.LaboratorioModel;

public interface ILaboratorioService {
	
	public List<LaboratorioModel> GetAll();
	public LaboratorioModel insertOrUpdate(LaboratorioModel laboratorio);

}

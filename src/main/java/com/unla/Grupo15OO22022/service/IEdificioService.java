package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.models.EdificioModel;

public interface IEdificioService {

	public List<EdificioModel> GetAll();
	public EdificioModel insertOrUpdate(EdificioModel edificio);
	
}

package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.models.EspacioModel;

public interface IEspacioService {

	
	public List<EspacioModel> GetAll();
	public EspacioModel insertOrUpdate(EspacioModel espacio);
}

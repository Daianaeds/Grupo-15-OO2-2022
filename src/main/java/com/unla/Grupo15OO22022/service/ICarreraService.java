package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.models.CarreraModel;

public interface ICarreraService {
	
	public List<CarreraModel> GetAll();
	public CarreraModel insertOrUpdate(CarreraModel carrera);

}

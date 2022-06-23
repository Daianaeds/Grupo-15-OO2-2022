package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.entity.Aula;
import com.unla.Grupo15OO22022.models.AulaModel;

public interface IAulaService {
	
	public List<Aula> GetAll();
	public AulaModel insertOrUpdate(AulaModel aula);

}

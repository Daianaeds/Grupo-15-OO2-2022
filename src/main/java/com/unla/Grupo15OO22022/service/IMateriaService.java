package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.entity.Materia;
import com.unla.Grupo15OO22022.models.MateriaModel;

public interface IMateriaService {
	
	public List<Materia> GetAll(); 
	public MateriaModel insertOrUpdate(MateriaModel materia);
	Materia findById(int idMateria);


}

package com.unla.Grupo15OO22022.service.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Materia;
import com.unla.Grupo15OO22022.models.MateriaModel;
import com.unla.Grupo15OO22022.repository.IMateriaRepository;
import com.unla.Grupo15OO22022.service.IMateriaService;

//para usar todas las funcionalidades JPA para poder manejar la BD 
@Service("materiaService")
public class MateriaService implements IMateriaService { // abstraer la logica de cada funcion - llamo a repository (que
															// seria como el dao)

	@Autowired
	private IMateriaRepository materiaRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<Materia> GetAll() {
		return materiaRepository.findAll();
	}

	@Override
	public MateriaModel insertOrUpdate(MateriaModel materia) { 
		// recibe una materiaModel y lo cambia a entidad
		//una vez hecho entidad que se guarda con el metodo save y una vez guardado el .map 
		// lo convierte en materiaModel para retonarlo
		 return modelMapper.map(materiaRepository.save(modelMapper.map(materia, Materia.class)), MateriaModel.class);
	}
	
	@Override
	public Materia findById(int idMateria) {
		return materiaRepository.findById(idMateria).orElse(null);
	}

}

package com.unla.Grupo15OO22022.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Carrera;
import com.unla.Grupo15OO22022.models.CarreraModel;
import com.unla.Grupo15OO22022.repository.ICarreraRepository;
import com.unla.Grupo15OO22022.service.ICarreraService;

@Service("carreraService")
public class CarreraService implements ICarreraService{

	@Autowired
	private ICarreraRepository carreraRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<CarreraModel> GetAll() {

		List<CarreraModel> carreras = new ArrayList<>();
		for (Carrera c : carreraRepository.findAll()) {
			carreras.add(modelMapper.map(c, CarreraModel.class));
		}
		return carreras;

	}

	@Override
	public CarreraModel insertOrUpdate(CarreraModel carrera) { 
		// recibe una CarreraModel y lo cambia a entidad
		//una vez hecho entidad que se guarda con el metodo save y una vez guardado el .map 
		// lo convierte en CarreraModel para retonarlo
		 return modelMapper.map(carreraRepository.save(modelMapper.map(carrera, Carrera.class)), CarreraModel.class);
	}

	
}

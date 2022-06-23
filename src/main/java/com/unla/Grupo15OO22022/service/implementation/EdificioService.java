package com.unla.Grupo15OO22022.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Edificio;
import com.unla.Grupo15OO22022.models.EdificioModel;
import com.unla.Grupo15OO22022.repository.IEdificioRepository;
import com.unla.Grupo15OO22022.service.IEdificioService;

@Service("edificioService")
public class EdificioService implements IEdificioService{

	@Autowired
	private IEdificioRepository edificioRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<EdificioModel> GetAll() {
		List<EdificioModel> edificios = new ArrayList<>();
		for (Edificio e : edificioRepository.findAll()) {
			edificios.add(modelMapper.map(e, EdificioModel.class));
		}
		return edificios;
	}

	@Override
	public EdificioModel insertOrUpdate(EdificioModel edificio) {
		 return modelMapper.map(edificioRepository.save(modelMapper.map(edificio, Edificio.class)), EdificioModel.class);

	}

}

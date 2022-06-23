package com.unla.Grupo15OO22022.service.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Aula;
import com.unla.Grupo15OO22022.models.AulaModel;
import com.unla.Grupo15OO22022.repository.IAulaRepository;
import com.unla.Grupo15OO22022.service.IAulaService;

@Service("aulaService")
public class AulaService implements IAulaService{

	
	@Autowired
	private IAulaRepository aulaRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<Aula> GetAll() {
		return aulaRepository.findAll();
	}

	@Override
	public AulaModel insertOrUpdate(AulaModel aula) {
		 return modelMapper.map(aulaRepository.save(modelMapper.map(aula, Aula.class)), AulaModel.class);

	}

}

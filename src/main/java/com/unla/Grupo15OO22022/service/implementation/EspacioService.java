package com.unla.Grupo15OO22022.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Espacio;
import com.unla.Grupo15OO22022.models.EspacioModel;
import com.unla.Grupo15OO22022.repository.IEspacioRepository;
import com.unla.Grupo15OO22022.service.IEspacioService;

@Service("espacioService")
public class EspacioService implements IEspacioService{

	@Autowired
	private IEspacioRepository espacioRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<EspacioModel> GetAll() {
		List<EspacioModel> espacios = new ArrayList<>();
		for (Espacio e : espacioRepository.findAll()) {
			espacios.add(modelMapper.map(e, EspacioModel.class));
		}
		return espacios;
	}

	@Override
	public EspacioModel insertOrUpdate(EspacioModel espacio) {
		 return modelMapper.map(espacioRepository.save(modelMapper.map(espacio, Espacio.class)), EspacioModel.class);
	}

}

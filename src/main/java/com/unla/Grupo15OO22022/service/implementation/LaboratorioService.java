package com.unla.Grupo15OO22022.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Laboratorio;
import com.unla.Grupo15OO22022.models.LaboratorioModel;
import com.unla.Grupo15OO22022.repository.ILaboratorioRepository;
import com.unla.Grupo15OO22022.service.ILaboratorioService;

@Service("laboratorioService")
public class LaboratorioService implements ILaboratorioService{
	
	@Autowired
	ILaboratorioRepository laboratorioRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<LaboratorioModel> GetAll() {
		List<LaboratorioModel> laboratorios = new ArrayList<>();
		for (Laboratorio l : laboratorioRepository.findAll()) {
			laboratorios.add(modelMapper.map(l, LaboratorioModel.class));
		}
		return laboratorios;
	}

	@Override
	public LaboratorioModel insertOrUpdate(LaboratorioModel laboratorio) {
		 return modelMapper.map(laboratorioRepository.save(modelMapper.map(laboratorio, Laboratorio.class)), LaboratorioModel.class);

	}

}

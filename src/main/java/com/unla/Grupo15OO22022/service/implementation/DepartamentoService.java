package com.unla.Grupo15OO22022.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.Departamento;
import com.unla.Grupo15OO22022.models.DepartamentoModel;
import com.unla.Grupo15OO22022.repository.IDepartamentoRepository;
import com.unla.Grupo15OO22022.service.IDepartamentoService;

@Service("departamentoService")
public class DepartamentoService implements IDepartamentoService {

	@Autowired
	private IDepartamentoRepository departamentoRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<DepartamentoModel> GetAll() {
		List<DepartamentoModel> departamentos = new ArrayList<>();
		for (Departamento d : departamentoRepository.findAll()) {
			departamentos.add(modelMapper.map(d, DepartamentoModel.class));
		}
		return departamentos;

	}

//	@Override
//	public Departamento insertOrUpdate(DepartamentoModel departamento) {
////		Departamento auxiliar = modelMapper.map(departamento, Departamento.class);
//		Departamento auxiliar = this.findById(departamento.getIdDepartamento());
//		auxiliar.setDepartamento(departamento.getDepartamento());
//		return modelMapper.map(departamentoRepository.save(auxiliar), Departamento.class);
//	}
	
	@Override
	public Departamento update(DepartamentoModel departamento) {
		Departamento auxiliar = this.findById(departamento.getIdDepartamento());
		auxiliar.setDepartamento(departamento.getDepartamento());
		return modelMapper.map(departamentoRepository.save(auxiliar), Departamento.class);
		}
	
	public Departamento crear(DepartamentoModel departamento) {
		Departamento aux = modelMapper.map(departamento, Departamento.class);
		return departamentoRepository.save(aux);
	}

	@Override
	public void delete(int idDepartamento) {
		departamentoRepository.deleteById(idDepartamento);
	}
	
	@Override
	public Departamento findById(int id) {
		return departamentoRepository.findById(id).get();
	}
	
	@Override
	public Departamento save(Departamento departamento) {
        return departamentoRepository.save(departamento);

    }

	
	

}

package com.unla.Grupo15OO22022.service.implementation;

import java.time.LocalDate;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.Grupo15OO22022.entity.NotaPedido;
import com.unla.Grupo15OO22022.models.NotaPedidoModel;
import com.unla.Grupo15OO22022.repository.INotaPedidoRepository;
import com.unla.Grupo15OO22022.service.INotaPedidoService;

@Service("notaPedidoService")
public class NotaPedidoService implements INotaPedidoService {

	@Autowired
	private INotaPedidoRepository notaPedidoRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<NotaPedido> GetAll() {

		return notaPedidoRepository.findAll();

	}

	@Override
	public NotaPedido update(NotaPedidoModel notaPedido) {
		NotaPedido auxiliar = this.findById(notaPedido.getIdNotaPedido());
		auxiliar.setIdNotaPedido((notaPedido.getIdNotaPedido()));
		;
		return modelMapper.map(notaPedidoRepository.save(auxiliar), NotaPedido.class);
	}

	public NotaPedido crear(NotaPedidoModel notaPedido) {
		NotaPedido aux = modelMapper.map(notaPedido, NotaPedido.class);
		return notaPedidoRepository.save(aux);
	}

	@Override
	public void delete(int IdNotaPedido) {
		notaPedidoRepository.deleteById(IdNotaPedido);
	}

	@Override
	public NotaPedido save(NotaPedido notaPedido) {
		notaPedido.setFecha(LocalDate.now());
		return notaPedidoRepository.save(notaPedido);

	}

	@Override
	public NotaPedido crearFinal(NotaPedido notaPedido) {
		return notaPedidoRepository.save(notaPedido);
	}

	@Override
	public NotaPedido findById(int idNotaPedido) {
		return notaPedidoRepository.findById(idNotaPedido).orElse(null);
	}

}

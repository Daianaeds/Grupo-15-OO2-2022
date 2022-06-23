package com.unla.Grupo15OO22022.service;

import java.util.List;

import com.unla.Grupo15OO22022.entity.NotaPedido;
import com.unla.Grupo15OO22022.models.NotaPedidoModel;

public interface INotaPedidoService {

	public List<NotaPedido> GetAll();
	NotaPedido update(NotaPedidoModel notaPedido);
	void delete(int IdNotaPedido);
	public NotaPedido findById(int idNotaPedido);
	NotaPedido save(NotaPedido notaPedido);
	NotaPedido crearFinal(NotaPedido notaPedido);

	//public NotaPedidoModel insertOrUpdate(NotaPedidoModel notapedido);

}

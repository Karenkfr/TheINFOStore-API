package com.TheINFOStore.service.impl;

import org.springframework.stereotype.Service;

import com.TheINFOStore.domain.entities.Pedido;
import com.TheINFOStore.domain.repositories.PedidoRepository;
import com.TheINFOStore.rest.DTO.PedidoDTO;
import com.TheINFOStore.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	private PedidoRepository pedidoRepository;

	@Override
	public Pedido salvar(PedidoDTO pedidoDTO) {
		return null;
	}
	
	
}

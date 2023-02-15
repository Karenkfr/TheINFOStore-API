package com.TheINFOStore.service;

import com.TheINFOStore.domain.entities.Pedido;
import com.TheINFOStore.rest.DTO.PedidoDTO;

public interface PedidoService {

	Pedido salvar(PedidoDTO pedidoDTO);
}

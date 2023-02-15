package com.TheINFOStore.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.TheINFOStore.domain.entities.Pedido;
import com.TheINFOStore.rest.DTO.PedidoDTO;
import com.TheINFOStore.service.PedidoService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	private PedidoService pedidoService;

	public PedidoController(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Integer save(@RequestBody PedidoDTO pedidoDTO) {
		Pedido pedido = pedidoService.salvar(pedidoDTO);
				return pedido.getId();
	}
	
	
}

package com.TheINFOStore.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TheINFOStore.domain.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}

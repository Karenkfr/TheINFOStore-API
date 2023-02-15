package com.TheINFOStore.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TheINFOStore.domain.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}

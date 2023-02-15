package com.TheINFOStore.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.TheINFOStore.domain.entities.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Integer> {
	
	@Query(value = "select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
	List<Cliente> encontrarPorNome(@Param("nome") String nome);
	
	
	@Query(value = "delete from Cliente c where c.nome =:nome ")
	@Modifying
	void deleteByName(String nome);
	
	boolean existeByName(String nome );
	
	
	@Query(value = "select c from Cliente c left join fetch c.pedidos where c.id = :id")
	Cliente findClienteFetchPedidos(@Param("id") Integer id);
	

}

package com.TheINFOStore.domain.entities;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column( name = "id")
	private Integer id;
	
	@Column( name = "nome", length = 100)
	private String nome;
	
	@Column( name = "cpf", length = 11)
	private String cpf;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private Set<Pedido> pedidos;
	
	
	
}

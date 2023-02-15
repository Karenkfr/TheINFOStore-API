package com.TheINFOStore.domain.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_pedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	@Column
	private Integer quantidade;
	
	

}


package org.example.repository;

import org.example.model.PedidoVenda;
import org.example.model.builder.PedidoVendaBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PedidosVenda {

	public List<PedidoVenda> getAll() {
		PedidoVenda pedido1 = PedidoVendaBuilder.criarPedidoVenda()
									.comId(1L)
									.comListaProdutos(new ArrayList<>())
									.criar();

		PedidoVenda pedido2 = PedidoVendaBuilder.criarPedidoVenda()
				.comId(2L)
				.comListaProdutos(new ArrayList<>())
				.criar();
		
		return Arrays.asList(pedido1, pedido2);
	}
	
}

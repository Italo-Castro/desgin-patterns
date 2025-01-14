package org.example.model.builder;

import java.util.List;

import org.example.model.PedidoVenda;
import org.example.model.Produto;

public class PedidoVendaBuilder {

	private PedidoVenda instancia;

	public static PedidoVendaBuilder criarPedidoVenda() {
		return new PedidoVendaBuilder();
	}
	
	public PedidoVendaBuilder() {
		this.instancia = new PedidoVenda();
	}
	
	public PedidoVendaBuilder comListaProdutos(List<Produto> produtos) {
		this.instancia.setProdutosPedido(produtos);
		return this;
	}

	public PedidoVendaBuilder comId(Long id) {
		this.instancia.setId(id);
		return this;
	}
	
	public PedidoVenda criar() {
		return this.instancia;
	}
	
}

package org.example.listeners;


import org.example.model.PedidoVenda;
import org.example.notifier.Notificador;

import java.util.List;

public class FaturamentoListener implements Listener {

	private Notificador notificador;
	
	public FaturamentoListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
    }

	@Override
    public void atualizar() {
		List<PedidoVenda> lancamentosVencidos = this.notificador.getPedidos();
		
		for (PedidoVenda pedidoVenda : lancamentosVencidos) {
			System.out.println("Novo pedido de venda, precisamos efetuar o faturamento " + pedidoVenda.toString());
		}
		
		// this.notificador.removerListener(this);
    }

}

package org.example.listeners;


import org.example.model.PedidoVenda;
import org.example.notifier.Notificador;

import java.util.List;

public class EntregaListener implements Listener {

	private Notificador notificador;
	
	public EntregaListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
    }

	@Override
    public void atualizar() {
		List<PedidoVenda> lancamentosVencidos = this.notificador.getPedidos();
		
		for (PedidoVenda pedidoVenda : lancamentosVencidos) {
			System.out.println("Novo pedido chegou, precisamos preparar par a entrega" + pedidoVenda.toString());
		}
		
		// this.notificador.removerListener(this);
    }

}

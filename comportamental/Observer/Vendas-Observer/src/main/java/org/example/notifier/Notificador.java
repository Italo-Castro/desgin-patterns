package org.example.notifier;


import org.example.listeners.Listener;
import org.example.model.PedidoVenda;

import java.util.List;

public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
	public void novosPedidos(List<PedidoVenda> lancamentosVencidos);

	public List<PedidoVenda> getPedidos();
	
}

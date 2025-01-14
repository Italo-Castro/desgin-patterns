package org.example.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.example.listeners.Listener;
import org.example.model.PedidoVenda;

public class NotificadorNovosPedidos implements Notificador {

	private Set<Listener> listeners;
	private List<PedidoVenda> novosPedidos;
	
	public NotificadorNovosPedidos() {
		this.listeners = new HashSet<>();
	}
	
	@Override
    public void registrarListener(Listener listener) {
	    this.listeners.add(listener);
    }

	@Override
    public void removerListener(Listener listener) {
	    this.listeners.remove(listener);
    }

	@Override
    public void notificarListeners() {
		for (Listener listener : listeners) {
			listener.atualizar();
		}
    }

	@Override
	public void novosPedidos(List<PedidoVenda> novosPedidos) {
		this.novosPedidos = novosPedidos;
		this.notificarListeners();
	}

	@Override
	public List<PedidoVenda> getPedidos() {
		return this.novosPedidos;
	}


}

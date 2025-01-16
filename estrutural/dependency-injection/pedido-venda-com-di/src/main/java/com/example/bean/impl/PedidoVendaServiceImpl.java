package com.example.bean.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.inject.Inject;

import com.example.bean.CalculadoraImposto;
import com.example.bean.PedidoVendaService;
import com.example.model.PedidoVenda;
import com.example.repository.PedidosVendas;

public class PedidoVendaServiceImpl implements PedidoVendaService {

	@Inject
	private PedidosVendas pedidosVendas;
	
	@Inject
	private CalculadoraImposto calculadoraImposto;

	@Override
    public void salvar(PedidoVenda pedidoVenda) {
		pedidoVenda.setData(new Date());
		
		BigDecimal imposto = calculadoraImposto.calcular(pedidoVenda.getValor());
		pedidoVenda.setImposto(imposto);
		
		pedidosVendas.salvar(pedidoVenda);
	}

}

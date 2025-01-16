package com.example;

import java.math.BigDecimal;

import com.example.bean.PedidoVendaService;
import com.example.model.PedidoVenda;
import com.example.util.cdi.WeldContext;

public class Principal {

	public static void main(String[] args) {
		PedidoVendaService service = WeldContext.INSTANCE.getBean(PedidoVendaService.class);
		PedidoVenda pedidoVenda = new PedidoVenda("sabonete", new BigDecimal("3.00"));
		
		service.salvar(pedidoVenda);
    }
	
}

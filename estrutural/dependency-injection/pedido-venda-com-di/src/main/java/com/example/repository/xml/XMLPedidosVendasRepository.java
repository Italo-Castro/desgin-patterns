package com.example.repository.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.example.model.PedidoVenda;
import com.example.repository.PedidosVendas;
import com.thoughtworks.xstream.XStream;

public class XMLPedidosVendasRepository implements PedidosVendas {

	@Override
    public void salvar(PedidoVenda pedidoVenda) {
		XStream xstream = new XStream();
	    xstream.alias("pedido-venda", PedidoVenda.class);
	    OutputStream out = null;
        try {
	        out = new FileOutputStream(pedidoVenda.getDescricao() + ".xml");
	        xstream.toXML(pedidoVenda, out);
        } catch (FileNotFoundException e) {
	        throw new RuntimeException("Erro salvando arquivo", e);
        }
    }

}

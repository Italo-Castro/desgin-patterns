package org.example.model;

import java.util.List;

public class PedidoVenda {

    private  Long id;

    private List<Produto> produtosPedido;

    public PedidoVenda(){}

    public PedidoVenda(Long id, List<Produto> produtosPedido) {
        this.id = id;
        this.produtosPedido = produtosPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProdutosPedido() {
        return produtosPedido;
    }

    public void setProdutosPedido(List<Produto> produtosPedido) {
        this.produtosPedido = produtosPedido;
    }
}

package com.bioformula.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.bioformula.pedidovenda.model.EnderecoEntrega;
import com.bioformula.pedidovenda.model.Pedido;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Pedido pedido;

    private List<Integer> itens;

    public CadastroClienteBean() {
        pedido = new Pedido();
        pedido.setEnderecoEntrega(new EnderecoEntrega());
        itens = new ArrayList<Integer>();
        itens.add(1);
    }

    public void salvar() {
    }

    public List<Integer> getItens() {
        return itens;
    }

    public Pedido getPedido() {
        return pedido;
    }

}

package com.bioformula.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.bioformula.pedidovenda.model.Cliente;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;

	private List<Integer> itens;

	public CadastroPedidoBean() {
		cliente = new Cliente();
		itens = new ArrayList<Integer>();
		itens.add(1);
	}

	public void salvar() {
	}

	public List<Integer> getItens() {
		return itens;
	}

	public Cliente getPedido() {
		return cliente;
	}

}

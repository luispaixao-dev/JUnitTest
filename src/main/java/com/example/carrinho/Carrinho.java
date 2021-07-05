package com.example.carrinho;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.produto.Produto;
import com.example.produto.ProdutoNaoEncontradoException;

public class Carrinho {
	
	private ArrayList<Produto> items;
	
	public Carrinho() {
		items = new ArrayList<Produto>();
	}
	
	public double getValorTotal() {
		double valorTotal = 0.0;
		
		for (Iterator<Produto> i = items.iterator(); i.hasNext();) {
			Produto item = (Produto) i.next();
			valorTotal += item.getPreco();
		}
		
		return valorTotal;
	}
	
	public void addItem(Produto item) {
		items.add(item);
	}
	
	public void removeItem(Produto item) throws ProdutoNaoEncontradoException {
		if (!items.remove(item)) {
			throw new ProdutoNaoEncontradoException();
		}
	}
	
	public int getQtdeItems() {
		return items.size();
	}
	
	public void esvazia() {
		items.clear();
	}
	

}
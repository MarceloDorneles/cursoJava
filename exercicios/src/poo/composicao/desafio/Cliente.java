package poo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	
	List <Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra (Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}	
		return total;
	}
	
	void detalhes() {
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Lista de Materiais:");
		for(Compra compra: compras) {
			System.out.println(compra.itens);
		}
			
	}
	
}

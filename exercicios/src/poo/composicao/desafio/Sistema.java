package poo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Marcelo");
		
		Compra pedido1 = new Compra();
		pedido1.adicionarItem("Geladeira", 4000, 1);
		pedido1.adicionarItem("Pc Gamer", 6000, 2);
		
		Cliente c2 = new Cliente("Bruna");
		
		Compra pedido2 = new Compra();
		pedido2.adicionarItem("Ar Condicionado", 3000, 2);
		pedido2.adicionarItem("Notebook", 2000, 1);
		
		c1.adicionarCompra(pedido1);
		c2.adicionarCompra(pedido2);
		
		System.out.println(c1.obterValorTotal());
		System.out.println(c2.obterValorTotal());
		
		
		c1.detalhes();
	}
}


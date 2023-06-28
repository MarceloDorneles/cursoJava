package streams.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

	// Dois filtros e 1 mapeamento
	// produto, preço e frete gratis, profesor solicitou

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 0.15, false);
		Produto p2 = new Produto("Computador Gamer", 0.05, false);
		Produto p3 = new Produto("Mouse", 0.1, true);
		Produto p4 = new Produto("Teclado", 0.20, true);
		Produto p5 = new Produto("Cadeira", 0.5, false);
		Produto p6 = new Produto("Placa de Video", 0.35, true);
		Produto p7 = new Produto("Monitor", 0.6, false);
		Produto p8 = new Produto("Gabinete", 0.15, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
		
		Predicate<Produto> desconto = p -> p.desconto >= 0.05;
		Predicate<Produto> frete = p -> !p.frete;
		
		Function<Produto, String> selecao = 
				p -> "O produto " + p.nome + " tem os requisitos solicitados"; 
				
		produtos.stream()
			.filter(desconto)
			.filter(frete)
			.map(selecao)
			.forEach(System.out::println);
	}
}

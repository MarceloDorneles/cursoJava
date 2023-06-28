package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		
		/*	
		 * DESAFIO BINARY OPERATOR
		 *
		 * 1. A partir do produto calcular o preco real com desconto
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar 2 casas decimais
		 * 5. Format: R$1234,56
		 */
		
		BinaryOperator<Double> precoProduto = (preco, desconto) -> preco * (1 - desconto);
		
		UnaryOperator<Double> setImposto = preco ->
			preco >= 2500 ? preco + (preco * 0.085) : preco;
		
		UnaryOperator<Double> setFrete = preco ->
			preco >= 3000 ? preco + 100 : preco + 50;
		
//		Function<Double, String> setDecimal = preco -> 
//			new DecimalFormat("#,###.##").format(preco);  DETALHE ERRADO: não é double.
		UnaryOperator<Double> setDecimal = preco ->
			Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		
		Function<Double, String> setFormatacao = preco -> 
		("R$ " + preco).replace(".", ",");
		
		String resultado = precoProduto
				.andThen(setImposto)
				.andThen(setFrete)
				.andThen(setDecimal)
				.andThen(setFormatacao)
				.apply(p1.preco, p1.desconto);
		
		System.out.println("Valor Final: " + resultado);
		
		
		//RESOLUÇÃO DO PROFESSOR
		
		Function<Produto, Double> precoFinal = p ->
			p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMunicipal = valor ->
			valor>= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = preco ->
			preco >= 3000 ? preco + 100: preco + 50;
		UnaryOperator<Double> arredondar = preco ->
			Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		Function<Double, String> formatar = preco ->
			("R$" + preco).replace(".", ",");
		
		String preco1 = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p1);
		System.out.println("O preço final é " + preco1);
		
		
		
	}
}

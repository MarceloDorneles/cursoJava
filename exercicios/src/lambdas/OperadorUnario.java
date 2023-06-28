package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//.andThen faz adi��o ou seguimento da maneira que � lida, da esquerda para direita
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		//.compose faz a adi��o ou seguinte de tr�s para frente, ou direita para esquerda
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}
}

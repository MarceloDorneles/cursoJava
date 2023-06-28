package fundamentos.exercicios;

import java.util.Scanner;

public class AoQuadradoEAoCubo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor: ");
		double valor = entrada.nextDouble();

		entrada.close();

		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);

		System.out.printf("O valor ao quadrado de %.2f é %.2f", valor, quadrado);
		System.out.printf("\nO valor ao cubo de %.2f é %.2f", valor, cubo);

	}

}

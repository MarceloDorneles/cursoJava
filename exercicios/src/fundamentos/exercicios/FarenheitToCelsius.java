package fundamentos.exercicios;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor em Farenheit:");
		double f = entrada.nextDouble();

		entrada.close();

		final double fator = 5.0 / 9.0;
		final double ajuste = 32;

		double conversao = (f - ajuste) * fator;
		System.out.println("O valor em Celsius é " + conversao);

	}
}

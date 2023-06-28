package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor em Celsius:");
		double c = entrada.nextDouble();

		entrada.close();

		final double ajuste = 32;
		final double fator = 9.0 / 5.0;

		double conversao2 = (c * fator) + ajuste;
		System.out.println("O valor em Farenheit é " + conversao2);
	}

}

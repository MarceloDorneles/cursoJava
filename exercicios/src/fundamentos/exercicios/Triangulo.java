package fundamentos.exercicios;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor da altura: ");
		double altura = entrada.nextDouble();
		System.out.print("Insira o valor da base: ");
		double base = entrada.nextDouble();

		entrada.close();

		System.out.printf("A = %.2f * %.2f / 2", base, altura);
		double area = base * altura / 2;

		System.out.printf("\nO Área do triângulo é %.2f mÂ²", area);
	}

}

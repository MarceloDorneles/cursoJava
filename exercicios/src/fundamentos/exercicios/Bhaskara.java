package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {

		double delta;
		double x1;
		double x2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("F�rmula a calcular:\nax� + bx + c = 0\n");
		System.out.print("Digite o valor de a: ");
		double a = entrada.nextDouble();
		System.out.print("Digite o valor de b: ");
		double b = entrada.nextDouble();
		System.out.print("Digite o valor de c: ");
		double c = entrada.nextDouble();

		entrada.close();

		System.out.printf("\nOs valores usados s�o:\n%.0fx� + %.0fx + %.0f = 0", a, b, c);

		delta = (Math.pow(b, 2) - 4 * a * c);
		System.out.printf("\nO valor de delta � %.2f", delta);

		x1 = (-b + delta) / 2 * a;
		System.out.printf("\nVari�vel 1 � x = %.2f", x1);

		x2 = (-b - delta) / 2 * a;
		System.out.printf("\nVari�vel 2 � x = %.2f", x2);

	}

}

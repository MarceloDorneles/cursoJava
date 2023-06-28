package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira seu peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Insira sua altura: ");
		double altura = entrada.nextDouble();

		entrada.close();

		double IMC = peso / (altura * altura);
		System.out.printf("Seu imc é: %.2f", IMC);

		String resultado = IMC < 18.5 ? "Abaixo do peso" : "";
		resultado = IMC > 18.5 && IMC < 24.9 ? "no Peso Ideal" : resultado;
		resultado = IMC > 25.0 && IMC < 29.9 ? "com Excesso de Peso" : resultado;
		resultado = IMC > 30.0 && IMC < 34.9 ? "com Obesidade Classe I" : resultado;
		resultado = IMC > 35.0 && IMC < 39.9 ? "com Obesidade Classe II" : resultado;
		resultado = IMC > 40.0 ? "com Obesidade Classe III" : resultado;

		System.out.println("\nVocê esta " + resultado);

	}

}

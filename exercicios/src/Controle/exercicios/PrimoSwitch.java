package Controle.exercicios;

import java.util.Scanner;

public class PrimoSwitch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		
		entrada.close();
		
		int contadorDivisores = 0;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDivisores++;
			}
		}
		
		switch(contadorDivisores) {
		case 0:
			System.out.printf("\nO número %d é primo", numero);
			break;
			default:
				System.out.printf("\nO número %d não é primo", numero);
		
		
		}
	}
}

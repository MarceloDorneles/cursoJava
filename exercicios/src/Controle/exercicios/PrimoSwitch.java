package Controle.exercicios;

import java.util.Scanner;

public class PrimoSwitch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
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
			System.out.printf("\nO n�mero %d � primo", numero);
			break;
			default:
				System.out.printf("\nO n�mero %d n�o � primo", numero);
		
		
		}
	}
}

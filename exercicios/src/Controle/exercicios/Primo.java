package Controle.exercicios;

import java.util.Scanner;

public class Primo {
	
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
		
		if (contadorDivisores == 0) {
			System.out.println("O num�ro " + numero + " � primo");
		} else {
			System.out.println("O n�mero " + numero + " n�o � primo");	
		}
	}
}    
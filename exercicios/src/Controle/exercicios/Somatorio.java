package Controle.exercicios;

import java.util.Scanner;

public class Somatorio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int valorSomado = 0;
		
		while(numero >= 0) {
			
			System.out.print("Insira o valor a ser somado: "); 
			numero = entrada.nextInt();
			
			if(numero >= 0) {
				
				valorSomado += numero;
			}
		}
		
		System.out.printf("\n\nResultado da soma: %d", valorSomado);
		
		entrada.close();
		
	}
}

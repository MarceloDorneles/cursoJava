package Controle.exercicios;

import java.util.Scanner;

public class Par {
	
	public static void main(String[] args) {
		
		Scanner entrada	= new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		int a = entrada.nextInt();
		
		entrada.close();
		
		if (a <= 10 && a >= 0) {
			System.out.println("O valor inserido � v�lido.");
			if (a % 2 == 0) {
				System.out.println("O valor inserido � par");
			}else {
				System.out.println("O valor inserido n�o � par");}
		}else{
			System.out.println("O valor inserido n�o � v�lido");
		}
	}
}

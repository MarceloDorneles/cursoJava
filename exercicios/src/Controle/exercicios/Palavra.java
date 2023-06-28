package Controle.exercicios;

import java.util.Scanner;

public class Palavra {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();
	}
}
package Controle.loop;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
//		If (...) sentença; ou {}
//		for (...) sentença; ou {}
//		While (...; ...; ...) sentença; ou {}
//		do sentença; ou{} while (...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
	}
}
 
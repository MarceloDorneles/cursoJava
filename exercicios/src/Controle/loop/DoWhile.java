package Controle.loop;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
//		If (...) senten�a; ou {}
//		for (...) senten�a; ou {}
//		While (...; ...; ...) senten�a; ou {}
//		do senten�a; ou{} while (...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
	}
}
 
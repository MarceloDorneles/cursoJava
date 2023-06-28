package Controle.loop;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite algo:\n caso queira sair, digite sair");
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")){
			valor = entrada.nextLine();
		}
		
		entrada.close();
		
	}
}

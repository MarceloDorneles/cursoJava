package Controle.ifs;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a nota:");
		double nota = entrada.nextDouble();
		entrada.close();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inv�lida");
		} else if (nota <= 10 && nota >= 7) {
			System.out.println("Parab�ns! Nota CSA");
		} else if (nota < 7 && nota >= 5) {
			System.out.println("Em recupera��o, nota CPA");
		} else if (nota < 5 && nota >= 0) {
			System.out.println("Reprovado! Nota CRA");
		}
	}
}

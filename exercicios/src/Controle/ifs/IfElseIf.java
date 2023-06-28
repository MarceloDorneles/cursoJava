package Controle.ifs;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a nota:");
		double nota = entrada.nextDouble();
		entrada.close();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inválida");
		} else if (nota <= 10 && nota >= 7) {
			System.out.println("Parabéns! Nota CSA");
		} else if (nota < 7 && nota >= 5) {
			System.out.println("Em recuperação, nota CPA");
		} else if (nota < 5 && nota >= 0) {
			System.out.println("Reprovado! Nota CRA");
		}
	}
}

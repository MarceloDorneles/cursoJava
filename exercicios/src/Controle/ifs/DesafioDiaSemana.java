package Controle.ifs;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva o dia da Semana: ");
		String dia = entrada.next();
		
		entrada.close();
		
		if (dia.equals("Domingo")) {
			
			System.out.println(dia + " - 1");
			
		}else if(dia.equalsIgnoreCase("Segunda")) {
			
			System.out.println(dia + " - 2");
			
		}else if(dia.equalsIgnoreCase("Terça")) {
		
			System.out.println(dia + " - 3");
		
		}else if(dia.equalsIgnoreCase("Quarta")) {
	
			System.out.println(dia + " - 4");
	
		}else if(dia.equalsIgnoreCase("Quinta")) {
			
			System.out.println(dia + " - 5");
			
		}else if(dia.equalsIgnoreCase("Sexta")) {
		
			System.out.println(dia + " - 6");
		
		}else if(dia.equalsIgnoreCase("Sábado")
				|| dia.equalsIgnoreCase("sabado")) {
	
			System.out.println(dia + " - 7");
	
		}else{
			System.out.println("Dia Inválido");
		}
	}
}

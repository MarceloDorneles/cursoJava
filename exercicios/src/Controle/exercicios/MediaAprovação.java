package Controle.exercicios;

import java.util.Scanner;

public class MediaAprova��o {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double notaParcial = 0;
		int verificado = 0;
		
		while (verificado < 2) {
			 
			System.out.print("Insira a nota do aluno:");
			nota = entrada.nextDouble();
			
			if(nota<=10 && nota >= 0) {
				notaParcial += nota;
				verificado++;
				
			}else {
				System.out.println("Nota inserida � inv�lida!");
			}
		}
		entrada.close();
		
		double notaMedia = notaParcial / verificado;
		System.out.println("Nota M�dia: " + notaMedia);
		
		if (notaMedia <= 10 && notaMedia >= 7) {
			System.out.println("Aprovado!");
		} else if (notaMedia < 7 && notaMedia > 4) {
			System.out.println("Recupera��o");
		} else if (notaMedia <= 4 && notaMedia >=0) {
			System.out.println("Reprovado!");
		}
	}
}

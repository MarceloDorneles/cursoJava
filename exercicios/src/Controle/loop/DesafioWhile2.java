package Controle.loop;

import java.util.Scanner;

public class DesafioWhile2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int alunosVerificados = 0;
		double nota = 0;
		double notaInserida = 0;
				
		
		while (notaInserida != -1) {
			System.out.print("Insira a nota do aluno: ");
			notaInserida = entrada.nextDouble();
			
			if(notaInserida <= 10 && notaInserida >= 0) {
				nota += notaInserida;
				alunosVerificados++;
			}else if(notaInserida != -1) {
				System.out.println("Inserir nota válida!");
			}
		}
		entrada.close();
		  
		System.out.println("Você possui " + alunosVerificados + " alunos");
		double notaFinal = nota;
		double notaMedia = nota / alunosVerificados;
		System.out.println("A nota total da turma é " + notaFinal +
				"\nE a nota média é " + notaMedia);
		
	}
}

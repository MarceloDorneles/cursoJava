package Controle.loop;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de alunos: ");
		int alunos = entrada.nextInt();
		int alunosVerificados = 1;
		double nota = 0;
		double notaInserida = 0;
		
		while (alunosVerificados <= alunos) {
			
			System.out.print("Insira a nota do aluno: ");
			notaInserida = entrada.nextDouble();
			
			if(notaInserida <= 10 && notaInserida >= 0) {
				nota += notaInserida;
				alunosVerificados++;
			}else{
				System.out.println("Inserir nota válida!");
				notaInserida = 0;
			}
		}
		entrada.close();
		  
		System.out.println("Você possui " + alunos + " alunos");
		double notaFinal = nota;
		double notaMedia = nota / alunos;
		System.out.println("A nota total da turma é " + notaFinal +
				"\nE a nota média é " + notaMedia);
		
	}
}

package Arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas o aluno possuí? ");
		int qtdN = entrada.nextInt();
		
		double[] notasAluno = new double[qtdN];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Insira a nota " + (i + 1) + ": ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		for (double notaAluno: notasAluno) {
			soma += notaAluno;
		}
		System.out.print("A nota somada do aluno é: " + soma + "\n");
		
		System.out.println("A média final do aluno é " + soma / notasAluno.length);
		
		entrada.close();
		
	}
	
}

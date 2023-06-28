package Controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando numero aleat�rio entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Come�ou o jogo! Tente acertar o n�mero!");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("tentativa %d: ", tentativas);
				numero = entrada.nextInt();
				
				if (numero > numeroSorteado) {
					System.out.printf("\nO numero sorteado � menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("\nO numero sorteado � maior que %d\n\n", numero);
				} else {
					System.out.printf("\nParab�ns! Voc� acertou o n�mero em %d tentativas!\n\n", tentativas);
					break;
				}				
			}while (tentativas != 10);
			
			System.out.println("Digite 0 para sair, ou qualquer outro n�mero para continuar: ");
			continuar = entrada.nextInt();
		} while (continuar != 0);
		
		entrada.close();
		
	}

}

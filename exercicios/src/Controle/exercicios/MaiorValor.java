package Controle.exercicios;

import java.util.Scanner;

public class MaiorValor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroAnterior = 0;
		int numeroSugerido = 0;
		int sequencia = 1;
		
		System.out.println("Identificador do Maior N�mero..,\n\n");
		
		for(;sequencia < 11; sequencia++) {
			
			System.out.printf("Insira o %d� valor: ",sequencia);
			numeroSugerido = entrada.nextInt();
			
			if (numeroAnterior < numeroSugerido) {
				
				numeroAnterior = numeroSugerido;
				System.out.println("N�mero inserido � maior que o numero anterior");
			} else if (numeroAnterior >= numeroSugerido) {
				
				System.out.println("O numero inserido � menor que o numero anterior");
			}
			
			entrada.close();
		}
		
		System.out.printf("O maior n�mero inserido � %d", numeroAnterior);
	}
}

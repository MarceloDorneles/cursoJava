package fundamentos;

import java.util.Scanner;

public class DesafioDoModulo {
	
	public static void main(String[] args) {
		
		//ler num1
		//ler num2
		//realizar operações do num1 com o num2, as operações são:
		// +, -, *, /, %
		
		//Inserção de dados
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o primeiro valor: ");
		double val1 = entrada.nextDouble();
		System.out.print("Insira o segundo valor: ");
		double val2 = entrada.nextDouble();
		System.out.print("Insira o operador utilizado: ");
		String op = entrada.next();
		
		entrada.close();

		System.out.printf("%.2f %s %.2f = ?", val1, op, val2);
		
		//Lógica
		
		double resultado = "+".equals(op.trim()) ? val1 + val2 : 0;
		resultado = "-".equals(op.trim()) ? val1 - val2 : resultado;
		resultado = "*".equals(op.trim()) ? val1 * val2 : resultado;
		resultado = "/".equals(op.trim()) ? val1 / val2 : resultado;
		resultado = "%".equals(op.trim()) ? val1 % val2 : resultado;
		
		System.out.printf("\nResultado: %.2f", resultado);
		
	}
}

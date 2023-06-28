package fundamentos.conversoes;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	
	String salario1 = entrada.nextLine().replace(",", ".");
	String salario2 = entrada.nextLine().replace(",", ".");
	String salario3 = entrada.nextLine().replace(",", ".");
	
	double salario1Conv = Double.parseDouble(salario1);
	double salario2Conv = Double.parseDouble(salario2);
	double salario3Conv = Double.parseDouble(salario3);
	
	System.out.printf("Salário do mês de Outubro foi: R$ %.2f;%nSalário do mês de Novembro foi: R$ %.2f;%nSalário do mês de Dezembro foi: R$ %.2f", salario1Conv, salario2Conv, salario3Conv);
	
	double soma = salario1Conv + salario2Conv + salario3Conv;
	System.out.println("\nA soma dos salários é R$ " + soma);
	System.out.println("A média dos salários é R$ " + soma / 3);
	
	entrada.close();
	}
}

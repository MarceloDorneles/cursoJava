package Controle.ifs;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero = Integer.parseInt(valor);
		
		
		if (numero % 2 == 0) {
			System.out.println("O valor insirido � par!");			
		}
		
		if (numero % 2 == 1) {
			System.out.println("O valor insirido � impar!");		
		}
		
		if (numero % 2 == 0) {
			System.out.println("O valor insirido � par!");
		}else{
			System.out.println("O valor insirido � impar!");
		}
	}
}

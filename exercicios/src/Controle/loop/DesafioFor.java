package Controle.loop;

public class DesafioFor {
	
	public static void main(String[] args) {
		
//		String valor = "#";
/*		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#"; 		
		}
*/		
		//VERS�O DO DESAFIO
		//N�O PODE SER USADO VALOR NUM�RICO PPAR CONTROLAR O LA�O
		
		String valor = "#";
		String valorFInal = "######";
		
		for(String i = valor; !i.equalsIgnoreCase(valorFInal); i += "#") {
			System.out.println(i);
			
		}
	}
}

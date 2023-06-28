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
		//VERSÃO DO DESAFIO
		//NÃO PODE SER USADO VALOR NUMÉRICO PPAR CONTROLAR O LAÇO
		
		String valor = "#";
		String valorFInal = "######";
		
		for(String i = valor; !i.equalsIgnoreCase(valorFInal); i += "#") {
			System.out.println(i);
			
		}
	}
}

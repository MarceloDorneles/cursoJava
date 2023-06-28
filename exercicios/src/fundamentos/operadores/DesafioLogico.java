package fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		
		boolean terca = true;
		boolean quinta = true;
		
		
		
		System.out.println("Comprar uma TV 50': " + (terca && quinta));
		System.out.println("Comprar uma TV 32': " + (terca ^ quinta));
		System.out.println("Ficar em casa: " + (!terca && !quinta));
	}
	
}

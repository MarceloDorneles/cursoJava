package fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		System.out.println("CÃ¡lculo para resolução:\n(((((6*(3+2))a²)/3*2)-(((1-5)*(2-7))/2)a²)a³)/10a³");
		
		a = (int) Math.pow((6 * (3 + 2)), 2);
		a = a/(3 * 2);
		
		b = (int) Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		
		c = 10;
		
		System.out.println("\nProgresso 1:\n(" + a + " - " + b + ")a³ / " + c + "a³");
		
		int ab = a - b;
		
		System.out.println("Progresso 2:\n" + ab + "a³ / " + c + "a³");
		
		int abc = (int)  (Math.pow(ab, 3) / Math.pow(c, 3));
		
		System.out.println("Resultado:\n" + abc);
				
	}
	
}

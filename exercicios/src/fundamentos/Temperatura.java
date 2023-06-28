package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		
		double f = 72;
		double conversao = (f - ajuste) * fator;
		System.out.println(conversao);
		
		final double fator2 = 9.0 / 5.0;
		
		double c = 30;
		double conversao2 = (c * fator2) + ajuste;
		System.out.println(conversao2);
		
	}
}

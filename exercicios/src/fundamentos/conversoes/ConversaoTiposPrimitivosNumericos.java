package fundamentos.conversoes;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; //Conversão Implícita
		System.out.println(a);
		
		float b = (float) 1.123456789855; // Conversão explícita (CAST)
		System.out.println(b);
		
		int c = -129;  // Conversão explícita (CAST)
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.9;
		int f = (int) e; //Conversão explícita (CAST)
		System.out.println(f);
		
	}
	
}

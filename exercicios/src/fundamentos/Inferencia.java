package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
	
		/*
		 * Variáveis não podem ser alternadas após serem definidas.
		 * Ex:
		 *  var a = 4.5
		 *  a = "Texto"
		 *  
		 *  Isso não é permitido
		 */
		
		double a = 4.5; //Declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//a = "..."; (Não pode ser feito)
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		//c = 4.5; (Não pode ser feito)
		
		double d; //Variável foi declarada.
		d = 123.65; //Váriavel foi inicializada.
		System.out.println(d); //Variável foi usada.
		
		var e = 123.45;
		System.out.println(e);
		//Quando variável dada como var, não pode ser declarada em uma linha e inicializada em outra.
		
		var f = 12; //Inteiro
		// f = 12.01; Não pode ser utilizado double após ser definida a var como inteiro
		//Pois não há como fazer tal conversão
		//Porém pode ser utilizado um valor inteiro após um double,
		//Pois identifica tal como double
		f = 12;
		System.out.println(f);
				
		
		
		
	}
	
}

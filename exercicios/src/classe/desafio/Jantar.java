 package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		//Cardápio
		Comida c1 = new Comida("Hamburguer", 0.5);
		Comida c2 = new Comida("Batata Frita", 0.2);
		Comida c3 = new Comida("Refrigerante", 0.1);
		
		//Clientes
		Pessoa p1 = new Pessoa("Marcelo", 82.4);
		
		System.out.println(p1.apresentação());
		p1.comer(c1);
		
		System.out.println(p1.apresentação());
		p1.comer(c2);

		System.out.println(p1.apresentação());
		p1.comer(c3);
		
		System.out.println(p1.apresentação());
		
	}
}

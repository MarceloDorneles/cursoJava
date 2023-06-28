package poo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcelo", "Malessa", -45);
		p1.setIdade(230); // alterar o valor da variavel
		
		System.out.println(p1.getIdade()); // ler o valor da variavel
		System.out.println(p1); //toString v     
		System.out.println(p1.getNomeCompleto());
	}
}

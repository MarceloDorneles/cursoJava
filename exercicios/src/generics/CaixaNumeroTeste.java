package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(12.01);
		System.out.println(caixaA.abrir());

		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(12);
		System.out.println(caixaB.abrir());
	}
}

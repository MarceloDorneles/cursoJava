package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		
		double media = 7.8;
//		String resultadoParcial = 
		String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "Em recuperação" : "Reprovado";
		
		System.out.println("o aluno está " + resultadoFinal);
		
		double nota = media;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto? "Sim" : "Não";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}

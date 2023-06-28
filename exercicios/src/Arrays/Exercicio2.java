package Arrays;

public class Exercicio2 {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		for(double notaAlunoA: notasAlunoA) {
			System.out.print(notaAlunoA + " ");
		}
		
		System.out.println();
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		for (double notaAlunoB: notasAlunoB) {
			System.out.print(notaAlunoB + " ");
		}

	}
}

package poo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("João");
		Aluno aluno2 = new Aluno ("Maria");
		Aluno aluno3 = new Aluno ("Pedro");
		
		Curso curso1 = new Curso ("Java Completo");
		Curso curso2 = new Curso ("Web Completo 2023");
		Curso curso3 = new Curso ("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCursos(curso3);
		aluno2.adicionarCursos(curso3);
		aluno3.adicionarCursos(curso3);
		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("eStou matriculado no curso de " + curso3.nome + "...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();			
		}
		System.out.println(aluno1.cursos.get(0).alunos);	
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
}

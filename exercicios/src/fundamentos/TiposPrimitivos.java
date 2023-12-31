package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos Numéricos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Boolean
		boolean estaDeFerias = false; //true ou false
		
		//Tipo Char
		char status = 'a'; //ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Números de viagems
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status );
		
	}
}

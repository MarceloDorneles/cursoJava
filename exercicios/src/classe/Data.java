package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
		
//		int a;
//		a = 2;
		
//		String s = null;
//		System.out.println(s);
		
		//byte, short, int, long -> 0
		//float, double -> 0.0
		//boolean -> false
		//char -> '\u0000'
	}
	
	Data(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
			
	String formatacaoDeData () {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.formatacaoDeData());
	}
}
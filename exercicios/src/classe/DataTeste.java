package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 21;
		d1.mes = 12;
		d1.ano = 1999;
		
		String dataFormatada = d1.formatacaoDeData();
		
		System.out.println(dataFormatada);
		
		Data d2 = new Data(8, 03, 2023);
 		
		String dataFormatada2 = d2.formatacaoDeData();
		
		System.out.println(dataFormatada2);
		
		System.out.println(d1.formatacaoDeData());
		System.out.println(d2.formatacaoDeData());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
  
package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentação() {
		return "Cliente: " + nome + "\nPeso do Cliente: " + String.format("%.2f", peso) + "kg";
	}
}

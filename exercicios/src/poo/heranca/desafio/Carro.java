package poo.heranca.desafio;

public class Carro {
	
	protected int vel = 0;
	public final int VEL_MAX;
	private int delta = 5;
	
	protected Carro(int velMax){
		VEL_MAX = velMax;
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public void acelerar() {
		if(vel + getDelta() <= VEL_MAX) {
			vel += getDelta();
		} else {
			vel = VEL_MAX;
			System.out.println("O carro está na velocidade máxima");
		}
	}
	
	public void frear() {
		if(vel > 0) {
			vel -= 5;
		} else {
			vel = 0;
			System.out.println("O carro está parado");
		}
	}
	
	public void velocimetro() {
		System.out.println("Velocimetro: " + vel + "kmh");
	}
	
	public String toString() {
		return "Velocimetro: " + vel + "kmh";
	}
}
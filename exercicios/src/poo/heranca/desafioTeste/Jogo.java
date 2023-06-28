package poo.heranca.desafioTeste;

import poo.heranca.Direcao;
import poo.heranca.Heroi;
import poo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);

		System.out.println("Monstro PV: " + monstro.vida);
		System.out.println("Heroi PV: " + heroi.vida);		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro PV: " + monstro.vida);
		System.out.println("Heroi PV: " + heroi.vida);		
	}
}

package poo.heranca.desafioTeste;

import poo.heranca.desafio.Cronos;
import poo.heranca.desafio.Lamborghini;

public class Rua {
	
	public static void main(String[] args) {
		
		Cronos c2 = new Cronos();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		c2.frear();
		
		c2.velocimetro();
		
		Lamborghini c3 = new Lamborghini(210);
		
		c3.acelerar();
		c3.ligarTurbo();
		c3.acelerar();
		c3.acelerar();
		c3.ligarAr();
		c3.acelerar();
		c3.desligarTurbo();
		System.out.println(c3.velocidadeDoAr());
		c3.acelerar();
		c3.acelerar();
		c3.desligarAr();
		c3.acelerar();
		c3.acelerar();


		
		c3.velocimetro();
		
		c3.frear();
		c3.frear();
		c3.frear();
		c3.frear();
		c3.frear();



		System.out.println(c3);
		
		
	}
}

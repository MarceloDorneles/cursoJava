package poo.heranca;

public class Jogador {
	
	public int vida = 100;
	public int x;
	public int y;
	
//	CONSTRUTOR PADRÃO
//	Jogador(){
//		this(0, 0);
//	}  
	
	protected Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;	
		} else {
			return false;
		}
		return true;
	}
	
	public boolean andar(Direcao direcao) {
		
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case SUL:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}
		
//		if (direcao == Direcao.NORTE) {
//			y++;
//		} else if (direcao == Direcao.SUL) {
//			y--;
//		} else if (direcao == Direcao.LESTE) {
//			x++;
//		} else if (direcao == Direcao.OESTE) {
//			x--;
//		}
		return true;
	}
}

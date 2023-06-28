package Controle.loop;

public class For3 {

	public static void main(String[] args) {
		
		int i = 0;
		for(; i < 10; i++){
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
		}
	}
}

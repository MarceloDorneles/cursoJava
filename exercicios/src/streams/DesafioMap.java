package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Número para String Binaria... 6 => "110"
		 * 2. Reverter a String... "110" => "011"
		 * 3. Conerter de volta para inteiro... "011" => 3.
		 */
		
		
		Consumer <Object> print = System.out::print; //Imprime no console o resultado.
		UnaryOperator <Object> display = n -> n + " "; 
		//Separa de forma organizada o resultado no display.
		
		Function <Integer, String> convBin = n -> Integer.toBinaryString(n); 
		//Converte o valor inteiro em uma String binária.
		UnaryOperator<String> inversão = n -> {
			StringBuilder nr = new StringBuilder(n);
			return n = nr.reverse().toString();
		};// Reverte a String Binária
		Function<String, Integer> convStr = n -> Integer.parseInt(n, 2);
		
		
		System.out.println("Primeira etapa...");
		nums.stream()		
			.map(convBin)
			.map(display)
			.forEach(print);
		
		System.out.println("\n\nSegunda etapa...");
		nums.stream()		
		.map(convBin)
		.map(inversão)
		.map(display)
		.forEach(print);
		
		System.out.println("\n\nTerceira etapa...");
		nums.stream()		
		.map(convBin)
		.map(inversão)
		.map(convStr)
		.map(display)
		.forEach(print);
		
	}
}

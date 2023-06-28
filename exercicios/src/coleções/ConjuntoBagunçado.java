package coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Charactere
		
		System.out.println(conjunto.size());
		
		conjunto.add("Teste"); // .add -> adiciona objeto ao Set.
		conjunto.add('x');
		System.out.println(conjunto.size()); 
		// .size -> Informa a quantidade de informações no Set.
		
		System.out.println(conjunto.remove("teste")); // .remove -> Retira o valor do Set.
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains('x')); 
		// .contains -> Verifica se há tal valor no Set.
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // .addAll -> faz a união de um Set a outro.
//		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // .retainAll -> Identifica os valores semelhantes.
		System.out.println(conjunto);
		
		conjunto.clear(); // .clear -> Limpa os valores do conjunto.
		System.out.println(conjunto);
	}
}

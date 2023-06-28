package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
//		Integer i = Integer.parseInt(entrada.nextLine());
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double db = 123.01;
		System.out.println(db);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
	
	}
	
}

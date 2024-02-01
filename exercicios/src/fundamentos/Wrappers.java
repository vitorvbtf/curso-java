package fundamentos;

import java.util.Scanner;

public class Wrappers {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println("Escreva um número: ");
		s = Short.parseShort(entrada.nextLine());
		
		System.out.println(l);
		System.out.println(b.byteValue());
		System.out.println(s.TYPE);
		System.out.println(i * 3);
		
		Boolean bo = Boolean.parseBoolean("Olá mundo");
		System.out.println(bo);
		
		entrada.close();
	}
}

package fundamentos;

import java.util.Scanner;

public class Duvida {

	public static void main(String[] args) {
		String numero = "28";
		Integer numero02 = Integer.parseInt(numero);
		System.out.println(numero02.TYPE);
		
		//número para String
		int string = 36;
		String textoEmNumero = Integer.toString(string);
		//ou
		String mensagem = "" + string;
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String para número
		String abc = "12";
		int cba = Integer.parseInt(abc);
		
		Integer olaMundo = 18;
		String helloWorld = olaMundo.toString();
		
		System.out.println(cba == 12);
		System.out.println(helloWorld.equals("18"));
		System.out.println(helloWorld);
		
		
		
		
		
		
		
		
		
		
		
	}
}

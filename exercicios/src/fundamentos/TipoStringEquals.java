package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		String numero = entrada.nextLine();
		System.out.println(numero == s);
		//Aqui ele vai retirar todos os espaços
		System.out.println(numero.trim().equals(s));
		
		entrada.close();
	}
}

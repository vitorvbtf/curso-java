package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Responda as perguntas com sim ou não");
		System.out.println("O trabalho um deu certo?");
		String trabalho01_usuario =  entrada.nextLine().replace("sim", "true").replace("não", "false");
		System.out.println("O trabalho dois deu certo?");
		String trabalho02_usuario =  entrada.nextLine().replace("sim", "true").replace("não", "false");
		
		Boolean trabalho01 = Boolean.parseBoolean(trabalho01_usuario);
		Boolean trabalho02 = Boolean.parseBoolean(trabalho02_usuario);
		
		if(trabalho01 && trabalho02) {
			System.out.println("Vamos comprar a tv de 52'");
			System.out.println("Vamos comprar sorvete");
		}else if(trabalho01 || trabalho02) {
			System.out.println("Vamos comprar a tv de 32'");
			System.out.println("Vamos comprar sorvete");
		}else {
			System.out.println("Não vamo comprar nada e estamos saudáveis");
		}
		entrada.close();
	}
}

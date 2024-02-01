package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.println("Dia!\n");
		
		System.out.println("Bom");
		System.out.println("Dia");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();  
		
		nome =  nome.concat(" Bruno");
		System.out.printf("Olá, %s! %nvocê tem %d anos", nome, idade);
		entrada.close();
	}
}

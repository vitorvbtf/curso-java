package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		double resultado = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(
				"Digite o primeiro numero que você deseja calcular: ");
		double num01 = entrada.nextDouble(); 
		
		entrada.nextLine();
		System.out.println(
				"Digite o operador que você deseja utilizar na sua operacao: ");
		String operador = entrada.nextLine();
		
		System.out.println(
				"Digite o segundo numero que você deseja calcular: ");
		double num02 = entrada.nextDouble();
		
		
		switch(operador) {
			case "+":
				resultado = num01 + num02;
				break;
			case "-":
				resultado = num01 - num02;
				break;
			case "*":
				resultado = num01 * num02;
				break;
			case "/":
				resultado = num01 / num02;
				break;
			case "%":
				resultado = num01 % num02;
				break;
		}
		System.out.printf("O resultado da sua operacao %.2f %s %.2f = %.2f", num01, operador, num02, resultado);
		entrada.close();
		
	}
}

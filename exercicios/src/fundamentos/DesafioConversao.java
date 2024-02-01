package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		String primeiroValor = entrada.nextLine().replace(",", ".");
		double primeiroValorFormatado = Double.parseDouble(primeiroValor); 
		
		System.out.println("Digite o segundo valor: ");
		String segundoValor = entrada.nextLine().replace(",", ".");
		double segundoValorFormatado = Double.parseDouble(segundoValor);
		
		System.out.println("Digite o terceiro valor :");
		String terceiroValor = entrada.nextLine().replace(",", ".");
		double terceiroValorFormatado = Double.parseDouble(terceiroValor);
		
		double media = (primeiroValorFormatado + segundoValorFormatado + terceiroValorFormatado ) / 3;
		
		System.out.printf("A média dos três salários eh: %.2f", media);
		
		entrada.close();
	}
}

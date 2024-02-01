package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		/*
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * System.out.println("Digite a sua idade: "); int idade = entrada.nextInt();
		 * System.out.println(idade);
		 * 
		 * entrada.close();
		 */
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		System.out.println(valor1 + valor2);
		
		double numero01 = Double.parseDouble(valor1);
		double numero02 = Double.parseDouble(valor2);
		System.out.println(numero01 + numero02);
		
		
		String textoDnv = Double.toString(numero02);
		System.out.println(textoDnv);
		
	}
}

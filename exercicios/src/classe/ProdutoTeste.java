package classe;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		//Aqui eu estou instanciando
		Produto p1 = new Produto("Notebook", 4853.11);
		
		p1.preco = 4356.89;
		var p2 = new Produto();
		
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho =(precoFinal1 + precoFinal2) / 2;
		System.out.printf("Media do carinho = RS%.2f.", mediaCarrinho);

		
	
		
	}
}

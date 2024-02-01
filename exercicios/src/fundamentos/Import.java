package fundamentos;

public class Import {

	public static void main(String[] args) {
		String nome = "Vitor";
		nome = nome.concat(" Bruno");
		String sobrenome = "Ferreira";
		sobrenome = sobrenome.replace("ferreira", "Toscano");
		System.out.println(nome.equalsIgnoreCase("VITor BRuno"));
		int titulos = 18;
		double saldo = 996.36;
		
		System.out.printf("O %s %s, tem %d titulos, e o saldo dele eh: R$%.1f", nome, sobrenome, titulos, saldo);
		
		String resposta = String.format("\nO %s %s, tem %d titulos, e o saldo dele eh: R$%.1f", nome, sobrenome, titulos, saldo);
		System.out.println(resposta);
	}
}

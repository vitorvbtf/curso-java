package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double subtracao = 86 - 32;
		final double divisao = 5.0 / 9.0;
		double temperatura = subtracao * divisao;
		System.out.println("São " + temperatura + " graus celsius");
}
}

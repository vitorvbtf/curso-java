package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		double conta01 = Math.pow(((6 * (3+2))),2) / (3 * 2);
		double conta02 = Math.pow(((1-5)*(2-7)/2),2);
		double conta01MenosConta02 = conta01 - conta02;
		double resultado = (Math.pow(conta01MenosConta02, 3)) / (Math.pow(10, 3)) ;
		System.out.println(resultado);
	}
}

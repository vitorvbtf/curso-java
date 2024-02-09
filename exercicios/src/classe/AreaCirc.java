package classe;

public class AreaCirc {

	double raio;
	final static double PI = 31415;
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	public double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raioInicial) {
		return PI * Math.pow(raioInicial, 2);
	}
	
}

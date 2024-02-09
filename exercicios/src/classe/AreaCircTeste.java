package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		
		AreaCirc a = new AreaCirc(10);
	    AreaCirc b = new AreaCirc(5);
	    
		System.out.println(b.area());
		System.out.println(a.area());
		System.out.println(AreaCirc.PI);
		
		//Usando um método statico, agora não será necessario
		//eu criar umas instância para executar o método
		System.out.println(AreaCirc.area(12));
	}
}

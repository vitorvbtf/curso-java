package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		
		
		// posso usar a infenrencia para instanciar um objeto
		var d2 = new Data(27,06,1989);
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}

package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 30;
		d1.mes = 06;
		d1.ano = 2023;
		
		// posso usar a infenrencia para instanciar um objeto
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 03;
		d2.ano = 2024;
		
		System.out.printf("%d/%d/%d \n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}

package entities;


public class CurrencyConverter {

	public static final double dollar = 3.10;
	public static double reais;
	public static final double iso = 0.06;
	
	
	public static double converterDollar(double quantity) {
		 reais += dollar * quantity;
		 
		 return reais += reais * iso;
	}
	

}

package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;


public class teste7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double quantity;
		System.out.println("How many dollars will be bought?");
		quantity = sc.nextDouble();
		
		double price = CurrencyConverter.converterDollar(quantity);
		
		System.out.println("Amount to be paid in reais = $" + price);
		

		
		
		sc.close();
	}

}

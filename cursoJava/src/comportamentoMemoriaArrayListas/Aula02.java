package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductArray;

public class Aula02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Shapeless Product Quantity: ");
		int n = sc.nextInt();
		ProductArray[] product = new ProductArray[n];
		
		for(int i = 0; i < product.length; i++) {
			sc.nextLine();
			System.out.print("Product Name: ");
			String name = sc.nextLine();
			System.out.print("Product Price: ");
			double price = sc.nextDouble();
			product[i] = new ProductArray(name,price);
		}
		double sum = 0;
		for(int i = 0; i < product.length; i++) {
			sum += product[i].getPrice();
		}
		double avg = sum / product.length;
		
		System.out.printf("Average Price: $%.2f", avg);
		
		sc.close();
	}

}

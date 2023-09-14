package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();

		Product pedido = new Product(name, price, quantity);

		pedido.setName("Computer");
		System.out.println("Updated name: " + pedido.getName());
		pedido.setPrice(1200.00);
		System.out.println("Updated price: " + pedido.getPrice());

		System.out.println("\nProduct data: " + pedido);

		System.out.println("\nEnter  the number of products to be added in stock: ");
		quantity = sc.nextInt();
		pedido.addProducts(quantity);
		System.out.println("\nUpdated data: " + pedido);

		System.out.println("\nEnter  the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		pedido.removeProducts(quantity);

		System.out.println("\nUpdated data: " + pedido);

		sc.close();
	}
}

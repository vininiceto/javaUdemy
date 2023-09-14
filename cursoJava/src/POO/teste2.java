package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Pedido;

public class teste2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Pedido pedido = new Pedido();
		

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		pedido.nome = sc.next();
		System.out.println("Price: ");
		pedido.valor = sc.nextDouble();
		System.out.println("Quantity: ");
		pedido.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + pedido);
		
		System.out.println("\nEnter  the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		pedido.addProducts(quantity);
		System.out.println("\nUpdated data: " + pedido);
		
		System.out.println("\nEnter  the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		pedido.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + pedido);
		
		sc.close();
}
}

package com.pedidos.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.pedidos.entities.Client;
import com.pedidos.entities.Order;
import com.pedidos.entities.OrderItem;
import com.pedidos.entities.Product;
import com.pedidos.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.println("Enter client data: \n");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(), status, client);
		
		for(int i = 1 ; i <= n; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			System.out.print("Product Name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product Price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product (productName, productPrice);
			OrderItem orderItem = new OrderItem (quantity, productPrice, product);
			order.addItem(orderItem);
			
		}
		
		System.out.println("\n" + order);
		
		
		
		
		
		
		
		sc.close();
	}

}

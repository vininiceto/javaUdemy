package com.Contribuintes.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.service.entities.Company;
import com.service.entities.Individual;
import com.service.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: \n", i);
			System.out.print("Individual or company (i/c)? ");
			Character ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualnCome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, anualnCome, healthExpenditures));
			} else {
				System.out.print("Number of Employees: ");
				Integer numberOfEmployees = sc.nextInt();

				list.add(new Company(name, anualnCome, numberOfEmployees));
			}

		}

		System.out.println("TAXES PAID: ");

		Double total = 0.0;

		for (TaxPayer tp : list) {

			System.out.println(tp.getName() + ", $ " + String.format("%.2f", tp.tax()));

			total += tp.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));

		sc.close();
	}

}
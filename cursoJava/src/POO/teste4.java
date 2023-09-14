package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class teste4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		System.out.println("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		employee.increseSalary(percentage);
		System.out.println("\nUpdated data: " + employee);
		
		sc.close();
	}

}

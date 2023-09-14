package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class teste3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and heigth: ");
		retangulo.width = sc.nextDouble();
		retangulo.hight = sc.nextDouble();
		
		System.out.println(retangulo);
		sc.close();
	}

}

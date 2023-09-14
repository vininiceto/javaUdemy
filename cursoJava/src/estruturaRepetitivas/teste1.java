package estruturaRepetitivas;

import java.util.Scanner;

public class teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar = sc.next();
		
		while (!continuar.equalsIgnoreCase("sair")) {
			System.out.println("Continuar falando? ");
			continuar = sc.next();
		}
		sc.close();
	}

}

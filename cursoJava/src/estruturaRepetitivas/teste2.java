package estruturaRepetitivas;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continuar = "";
		
		while(!continuar.equalsIgnoreCase("sair")) {
			System.out.println("Você é linda, caso deseje parar digite: Sair");
			continuar = sc.next();
		}
		System.out.println("FIM!");
		sc.close();
	}

}

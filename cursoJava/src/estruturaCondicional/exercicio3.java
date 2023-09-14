package estruturaCondicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
	}

}

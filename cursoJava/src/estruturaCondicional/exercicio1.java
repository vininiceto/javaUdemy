package estruturaCondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite um número: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();

	}

}

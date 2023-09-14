package estruturaCondicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para verificar se é impar ou par: ");
		n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}

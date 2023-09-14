package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, quantity;
		System.out.print("Quantos numeros voce deseja digitar? ");
		n = sc.nextInt();

		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		quantity = 0;
		System.out.println("Numeros Pares: ");
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + "  ");
				quantity++;
			}
		}
		System.out.printf("\n\nQuantidade de pares = %d", quantity);

		sc.close();
	}

}

package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma, numpar;
		double media = 0;
		System.out.print("Quantos elementos tera o vetor? ");
		n = sc.nextInt();

		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		soma = 0;
		numpar = 0;
		for (int i = 0; i < n; i++) {
			if (num[i] % 2 == 0) {
				soma += num[i];
				numpar++;
			}
		}

		if (numpar == 0) {
			System.out.println("Nenhum numero é par");
		} else {
			media = (double) soma / numpar;

			System.out.println("Numeros Pares: ");
			System.out.printf("Media dos pares = %.2f", media);
		}
		sc.close();
	}

}

package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elemtnso vai ter o vetor? ");
		int n = sc.nextInt();
		double media = 0, sum = 0;

		double[] num = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
			sum += num[i];
		}
		media = sum / n;
		System.out.printf("Media do vetor: %.3f", media);

		System.out.println("\nElementos abaixo da media:");
		for (int i = 0; i < n; i++) {
			if (num[i] < media) {
				System.out.println(num[i]);
			}
		}

		sc.close();
	}
}
package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce deseja digitar? ");
		int n = sc.nextInt();

		double[] numeros = new double[10];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		System.out.println("Valores: ");
		double soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(numeros[i] + "  ");
			soma += numeros[i];
		}
		double media = soma / n;
		System.out.printf("\nSoma: %.2f", soma);
		System.out.printf("\nMedia: %.2f", media);

		sc.close();
	}

}

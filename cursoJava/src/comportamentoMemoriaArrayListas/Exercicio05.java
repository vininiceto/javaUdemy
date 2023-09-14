package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicao;
		double maiorNum;
		System.out.print("Quantos numeros deseja digitar? ");
		n = sc.nextInt();

		double[] num = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		maiorNum = 0;
		posicao = 0;
		for (int i = 1; i < n; i++) {
			if (num[i] > num[i - 1]) {
				maiorNum = num[i];
				posicao = i;
			}
		}

		System.out.printf("Maior valor: %.2f", maiorNum);
		System.out.printf("\nPosicao do maior valor: %d", posicao);

		sc.close();
	}

}

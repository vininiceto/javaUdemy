package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		int nmenores;
		double alturaTotal, alturaMedia, percentualMenores;
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		nmenores = 0;
		alturaTotal = 0;

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				nmenores++;
			}
			alturaTotal = alturaTotal + altura[i];
		}

		alturaMedia = alturaTotal / n;
		percentualMenores = ((double) nmenores / n) * 100;

		System.out.printf("\n Altura media = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", altura[i]);
			}
		}

		sc.close();
	}

}

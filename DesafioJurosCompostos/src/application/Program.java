package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		double valorInicial = scanner.nextDouble();

		double taxaJuros = scanner.nextDouble();

		int periodo = scanner.nextInt();
		double valorFinal = valorInicial * (Math.pow(1 + taxaJuros, periodo));

		// TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os
		// juros.

		System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);

		scanner.close();
	}

}

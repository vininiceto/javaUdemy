package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		double saldo = 0;
		do {
			double valor = scanner.nextDouble();
			if (valor > 0) {
				// TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide
				// Exemplos).
				saldo = valor + saldo;
				System.out.printf("Deposito realizado com sucesso! \nSaldo atual: R$ %.2f", saldo);
			} else {
				if (valor == 0) {
					System.out.println("Encerrando o programa...");
					break;
				}
				System.out.println("Valor Inválido! Digite um valor maior que zero.");
				valor = scanner.nextDouble();

			}

		} while (saldo != 0);
		scanner.close();
	}
}

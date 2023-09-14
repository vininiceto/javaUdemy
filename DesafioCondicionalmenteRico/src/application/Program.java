package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int saldoTotal = scanner.nextInt();
		int valorSaque = scanner.nextInt();
		int saldo = saldoDisponivel(saldoTotal, valorSaque);

		if (saldoTotal < valorSaque) {
			System.out.println("Saldo insuficiente. Saque nao realizado!");
		} else {
			saldoDisponivel(saldoTotal, valorSaque);
			System.out.printf("Saque realizado com sucesso. Novo saldo: %d", saldo);

		}

		scanner.close();
	}

	public static int saldoDisponivel(int saldoTotal, int valorSaque) {

		int saldo = saldoTotal - valorSaque;
		return saldo;

	}

}

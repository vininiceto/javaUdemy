package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double saldoAtual, valorDeposito, valorRetirada, saldoFinal;
		
		saldoAtual = sc.nextDouble();
		valorDeposito = sc.nextDouble();
		valorRetirada = sc.nextDouble();
		
		saldoFinal = saldoAtual + valorDeposito - valorRetirada;
		
		System.out.printf("Saldo atualizado na conta: %.1f", saldoFinal);
		
		sc.close();
	}

}

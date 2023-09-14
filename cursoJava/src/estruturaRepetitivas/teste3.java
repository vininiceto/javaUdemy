package estruturaRepetitivas;

import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continuar = "";
		double deposito = 0;
		double sacar = 0;
		double conta = 0;

		do {
			System.out.println(
					"Digite (d) para depositar!\nCaso queira sacar digite (s)!\nCaso queira ver o saldo digite (saldo)!\nCaso queira sair digite (sair)!");
			continuar = sc.next();
			if (continuar.equalsIgnoreCase("d")) {
				System.out.println("Digite o valor que deseja depositar: ");
				deposito = sc.nextDouble();
				conta += deposito;
			} else if (continuar.equalsIgnoreCase("s")) {
				System.out.println("Digite o valor que deseja sacar: ");
				sacar = sc.nextDouble();
				conta -= sacar;
			} else if (continuar.equalsIgnoreCase("saldo")) {
				System.out.printf("O valor em sua conta é:R$%.2f\n", conta);
			}

		} while (!continuar.equalsIgnoreCase("sair"));
		System.out.println("Muito Obrigado por usar nosso aplicativo!");
		sc.close();

	}
}

package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas deseja cadastrar? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		String pessoaMaisVelha = "";
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: ", i + 1);
			System.out.print("\nNome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		for (int i = 1; i < n; i++) {
			if (idade[i] >= idade[i - 1]) {
				pessoaMaisVelha = nome[i];
			}
		}
		System.out.printf("Pessoa mais velha: %s", pessoaMaisVelha);
		sc.close();
	}

}

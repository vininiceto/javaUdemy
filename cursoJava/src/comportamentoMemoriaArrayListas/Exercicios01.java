package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce deseja digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[10];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println("Numeros Negativos: ");
		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}

		sc.close();
	}

}

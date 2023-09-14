package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores deseja ter em cada vetor? ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		System.out.println("Digite os numeros do primeiro vetor: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Digite os numeros do segundo vetor: ");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}

		sc.close();
	}
}

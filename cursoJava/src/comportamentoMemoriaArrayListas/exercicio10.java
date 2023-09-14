package comportamentoMemoriaArrayListas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao cadastrados? ");
		int n = sc.nextInt();
		double media;
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome do Aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Digite a primeira nota: ");
			nota1[i] = sc.nextDouble();
			System.out.print("Digite a segunda nota: ");
			nota2[i] = sc.nextDouble();
		}
		System.out.println("Alunos Aprovados: ");
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", nome[i]);
			}
		}

		sc.close();
	}

}

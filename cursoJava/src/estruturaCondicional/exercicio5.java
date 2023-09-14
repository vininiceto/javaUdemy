package estruturaCondicional;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int codigo = 0, quantidade = 0;
		double valor = 0, total = 0;
		String produto;
		Scanner sc = new Scanner(System.in);
		System.out.println("De acordo com a tabela digite o código do produto que deseja: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade que deseja do produto: ");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			valor = 4.00;
			total = valor * quantidade;
			produto = "Cachorro Quente";
			System.out.printf("O %s possui o valor R$%.2f.", produto, total);

		} else if (codigo == 2) {
			valor = 4.50;
			total = valor * quantidade;
			produto = "X-Salada";
			System.out.printf("O %s possui o valor R$%.2f.", produto, total);
		} else if (codigo == 3) {
			valor = 5.00;
			total = valor * quantidade;
			produto = "X-Bacon";
			System.out.printf("O %s possui o valor R$%.2f.", produto, total);
		} else if (codigo == 4) {
			valor = 2.00;
			total = valor * quantidade;
			produto = "Torrada Simples";
			System.out.printf("O %s possui o valor R$%.2f.", produto, total);
		} else if (codigo == 5) {
			valor = 1.50;
			total = valor * quantidade;
			produto = "Refrigerante";
			System.out.printf("O %s possui o valor R$ %.2f.", produto, total);
		} else {
			System.out.println("Código de produto digitado inválido");
		}
		sc.close();
	}

}

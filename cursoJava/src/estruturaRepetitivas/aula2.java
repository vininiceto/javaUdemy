package estruturaRepetitivas;

import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a quantidade de números que deseja somar:");
	int n = sc.nextInt(), soma = 0;
	for(int i = 0; i < n; i++) {
		System.out.println("Digite o número para soma: ");
		int x = sc.nextInt();
		soma += x;
		
	}
	sc.close();
	System.out.println(soma);
	}

}

package estruturaRepetitivas;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double divisao = 0;
	for (int i = 0; i < n; i++) {
	
		double a = sc.nextInt();
		double b = sc.nextInt();
		if (b == 0) {
			System.out.println("divisao impossivel");
	}
		else {
			divisao = a / b;
			System.out.println(divisao);
		}
	}
	sc.close();
	}
	}

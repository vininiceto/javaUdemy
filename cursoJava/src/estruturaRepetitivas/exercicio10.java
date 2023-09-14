package estruturaRepetitivas;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite até que númreo deseja verificar os pares e os impares: ");
		int n = sc.nextInt();
		int impar = 0, par = 0;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				System.out.printf("%d é par \n",i);
				par++;
			}
			else {
				System.out.printf("%d é impar \n",i);
				impar++;
			}
		}
		sc.close();
		System.out.printf("Quantidade de números par: %d\nQuantidade de números impares: %d", par, impar);
	}

}

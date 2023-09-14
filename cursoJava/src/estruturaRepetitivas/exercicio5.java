package estruturaRepetitivas;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), in = 0, out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;

			} else {
				out++;
			}
		}
		sc.close();
		System.out.printf("%d in \n%d out", in, out);
	}

}

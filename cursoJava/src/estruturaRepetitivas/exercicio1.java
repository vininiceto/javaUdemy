package estruturaRepetitivas;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int password = sc.nextInt(), x = 2002;
	
	while (password != x) {
		System.out.println("Senha Inválida");
		password = sc.nextInt();
		
	}
	System.out.println("Acesso permitido");
		
	sc.close();
	
	}

}

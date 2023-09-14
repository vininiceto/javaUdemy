package estruturaCondicional;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial = 0, horaFinal = 0, duracao = 0;
		System.out.println("Digite a hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaInicial - horaFinal;
		}
		else {
			duracao = horaInicial + horaFinal - 24;
		}
		System.out.printf("O jogo durou %d HORA(S)", duracao);
		sc.close();
	}

}

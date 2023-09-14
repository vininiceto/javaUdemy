package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.alunos;

public class teste5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		alunos Alunos = new alunos();
		
		System.out.println("Digite o nome do aluno: ");
		Alunos.name = sc.nextLine();
		System.out.println("Digite as 3 notas do aluno: ");
		Alunos.note1 = sc.nextDouble();
		Alunos.note2 = sc.nextDouble();
		Alunos.note3 = sc.nextDouble();
		
		System.out.println("Final Grade: " + Alunos.medium());
		
		if(Alunos.medium() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points!", Alunos.missingPoints());
		}
		else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}

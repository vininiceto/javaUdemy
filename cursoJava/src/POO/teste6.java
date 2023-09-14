package POO;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcularSalario;

public class teste6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalcularSalario calcularSalario = new CalcularSalario();
		System.out.println("Digite o nome do funcionario: ");
		calcularSalario.nome = sc.next();
		System.out.println("Digite o valor que o funcionario recebe por hora trabalhada: ");
		calcularSalario.valorHora = sc.nextDouble();
		System.out.println("Digite quantas horas o funcionario trabalha por dia: ");
		calcularSalario.horas = sc.nextDouble();
		System.out.println("Digite quantos dias o funcionario trabalhou: ");
		calcularSalario.dias = sc.nextInt();
		
		System.out.println("O " + calcularSalario);
	
		sc.close();
	}

}

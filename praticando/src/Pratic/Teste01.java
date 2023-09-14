package Pratic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;
import entities.verificar;

public class Teste01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name, verify;
		int age;
		LocalDateTime d01 = LocalDateTime.now();
		Cadastro cs = new Cadastro(name = "", age = 0);
		verificar vs = new verificar(verify = "");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			System.out.println("Bem vindo ao Programa de Cadastro de Usuário");

			System.out.print("\nDigite o nome do usuário que deseja cadastrar: ");
			name = sc.next();
			cs.getName();
			System.out.print("\nDigite a idade do usuário: ");
			age = sc.nextInt();
			cs.getAge();

			if (cs.getName().toString() == null) {
				System.out.println("\nNão foi digitado nenhum nome");
			} else if (age <= 0) {
				System.out.println("\nA idade digitada foi menor ou igual a 0");
			}
			System.out.println("\nDeseja ver o cadastro do usuário?");
			vs.setVerify(sc.next().toString());
			if (vs.getVerify().toString().equals("sim")) {
				System.out.println("\nNome do usuário: " + name + "\nIdade do usuário: " + age + "\nData do cadastro: "
						+ fmt1.format(d01));
			}
			System.out.println("Deseja sair do programa? Caso sim digite: sair");
			verify = sc.next();
			vs.getVerify();

		} while (vs.getVerify().toString() == "sair");

		if (vs.getVerify().toString().equals("sair")) {
			System.out.println("Obrigado por usar o sistema!");
		}

		sc.close();
	}

}

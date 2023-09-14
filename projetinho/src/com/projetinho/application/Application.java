package com.projetinho.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.projetinho.entities.Cadastro;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome = null, cargo = null;
		String cpf = null;
		Date data = null;
		Integer idade = null;
		Double salario = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		List<Cadastro> list = new ArrayList<>();
		try {
			System.out.print("Quantos funcionarios deseja cadastrar? ");
			int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
				System.out.printf("Usuário #%d", i + 1);
				System.out.print("\nNome:");
				sc.nextLine();
				nome = sc.nextLine();
				System.out.print("CPF:");
				cpf = sc.nextLine();
				System.out.print("Data do cadastro:");
				data = formatter.parse(sc.next());
				System.out.print("Idade:");
				idade = sc.nextInt();
				System.out.print("Cargo:");
				sc.nextLine();
				cargo = sc.nextLine();
				System.out.println("Salario:");
				salario = sc.nextDouble();
		}}
			catch (ParseException e) {
				System.out.println("Data inválida!");
			}
		 catch (InputMismatchException e) {
				System.out.println("Parametro Digitado Inválido, use número");
			}
		catch(NullPointerException e) {
			System.out.println("Reinicie o sistema!");
		}

			Cadastro cs = new Cadastro(nome, cpf, data, idade, cargo, salario);

			list.add(cs);
		
		for (Cadastro c : list) {
			System.out.println(c);
		}

		sc.close();
	}

}

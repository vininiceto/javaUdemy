package com.projetinho.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadastro {

	private String nome;
	private String cpf;
	private Date data;
	private Integer idade;
	private String cargo;
	private Double salario;

	public Cadastro(String nome, String cpf, Date data, Integer idade, String cargo, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String cadastroData(Date data) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(data);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String imprimeCPF(String cpf) {
		return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
				+ cpf.substring(9, 11));
	}

	@Override
	public String toString() {
		return "Nome Usuário: " + nome + "\nCpf: " + imprimeCPF(cpf) + "\nData do cadstro: " + cadastroData(data)
				+ "\nIdade: " + idade + "\nCargo: " + cargo + "\nSalario: " + salario;
	}

}

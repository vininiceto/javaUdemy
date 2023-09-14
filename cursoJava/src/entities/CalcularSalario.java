package entities;

public class CalcularSalario {

	public String nome;
	public double salarioFixo;
	public int dias;
	public double horas;
	public double valorHora;
	
	public double calcSalario() {
		return salarioFixo += (valorHora  * horas) * dias;
	}

	public String toString() {
		return nome + " " + "recebe o valor de $" + String.format("%.2f", calcSalario());
	}
	
	
}

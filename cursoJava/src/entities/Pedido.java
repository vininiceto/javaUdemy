package entities;

public class Pedido {
	public String nome;
	public Double valor;
	public int quantity;
	
	public double totalValueInStock() {
		return valor * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", valor) + ", " + 
		quantity + " units , Total: $" + String.format("%.2f", totalValueInStock());
	}
}

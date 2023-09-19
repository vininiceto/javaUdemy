package com.service.entities;

public abstract class TaxPayer {

	private String name;
	private Double anuallnCome;

	public TaxPayer() {
	}

	public TaxPayer(String name, Double anuallnCome) {
		this.name = name;
		this.anuallnCome = anuallnCome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallnCome() {
		return anuallnCome;
	}

	public void setAnuallnCome(Double anuallnCome) {
		this.anuallnCome = anuallnCome;
	}

	public abstract Double tax ();
	
	
}

package com.service.entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anuallnCome, Integer numberOfEmployees) {
		super(name, anuallnCome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double tax() {
	
		if(numberOfEmployees > 10) {
			return getAnuallnCome() * 0.14;
		}
		else {
			return getAnuallnCome() * 0.16;
		}
		
		
	}	
}

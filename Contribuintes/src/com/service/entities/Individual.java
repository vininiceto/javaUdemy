package com.service.entities;

public class Individual extends TaxPayer {

	
	private Double healthExpenditures;
	
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anuallnCome, Double healthExpenditures) {
		super(name, anuallnCome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if(getAnuallnCome() > 20000.00) {
			
			return (getAnuallnCome() * 0.25) - (healthExpenditures * 0.50);
			
		}
		else {
			return (getAnuallnCome() * 0.15) - (healthExpenditures * 0.50);
		}
			
	}

	
}

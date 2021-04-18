package com.jobs.application;

import com.jobs.domain.ITaxesRate;

public class TaxesFactory {

	
	public static ITaxesRate createTaxesRateBoss(){
		return new ITaxesRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.68;
			}
		};
	}

	public static ITaxesRate createTaxesRateManager() {
		return new ITaxesRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.74;
			}
		};
	}

	public static ITaxesRate createTaxesRateSenior() {
		return new ITaxesRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.76;
			}
		};
	}

	public static ITaxesRate createTaxesRateMid() {
		return new ITaxesRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}

	public static ITaxesRate createTaxesRateJunior() {
		return new ITaxesRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.98;
			}
		};
	}

	public static ITaxesRate createTaxesRateVolunteer() {
		return new ITaxesRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.0;
			}
		};
	}
	
	
}

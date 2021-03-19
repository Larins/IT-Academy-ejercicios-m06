package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	//BOSS +50%
	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	
	//EMPLOYEE -15%
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*(-1.15); 
			}
		};
	}
	
	//MANAGER +10%
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1; 
			}
		};
	}
	
	//VOLUNTEER DOESN'T HAVE A SALLARY
	
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return 0; 
			}
		};
	}
	
}

package com.jobs.application;

import com.jobs.domain.IBonusRate;

public class BonusFactory {

	
	public static IBonusRate createBonusManager(){
		return new IBonusRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	public static IBonusRate createBonusRateBoss(){
		return new IBonusRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	public static IBonusRate createBonusRateEmployee(){
		return new IBonusRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}

	public static IBonusRate createBonusRateSenior(){
		return new IBonusRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	public static IBonusRate createBonusRateMid(){
		return new IBonusRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	public static IBonusRate createBonusRateJunior(){
		return new IBonusRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
	public static IBonusRate createBonusRateVolunteer(){
		return new IBonusRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
}

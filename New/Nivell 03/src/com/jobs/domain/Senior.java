package com.jobs.domain;

public class Senior extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;
	private ITaxesRate taxesRate;
	private IBonusRate bonusRate;	

	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, ITaxesRate taxesRate, IBonusRate bonusRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth>4000 || salaryPerMonth<2700) throw new Exception("El sueldo base del senior debe ser entre 2700€ y 4000€.");
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		this.taxesRate=taxesRate;
		this.bonusRate=bonusRate;
	}
	
	
	public static void main(String[] args) {}

	
	@Override
	public void pay() {
		brutoMesBase=salaryPerMonth;
		brutoMesPlus=paymentRate.pay(salaryPerMonth);
		brutoMesPlusBonus=bonusRate.pay(brutoMesPlus);
		brutoYearTotal=bonusRate.pay(brutoMesPlus)*12;
		netoMesTotal=taxesRate.pay(brutoMesPlusBonus);
		netoYearTotal=netoMesTotal*12;
	}
}
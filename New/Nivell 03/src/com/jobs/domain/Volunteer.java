package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;
	private ITaxesRate taxesRate;
	private IBonusRate bonusRate;	

	public Volunteer(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, ITaxesRate taxesRate, IBonusRate bonusRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth>0) throw new Exception("El sueldo del JUNIOR debe ser 0€.");
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
		grant=300;
		}
}
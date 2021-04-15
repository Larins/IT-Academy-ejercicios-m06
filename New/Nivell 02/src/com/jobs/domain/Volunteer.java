package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Volunteer(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth>0) throw new Exception("El sueldo del JUNIOR debe ser 0€.");
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	public static void main(String[] args) {}

	
	@Override
	public void pay() {
		salaryPerMonth = 0;
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

}
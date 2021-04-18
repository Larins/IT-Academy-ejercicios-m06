package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
    public JobsController() {
    	
    	repository = new EmployeeRepository();
    }

    public void createBoss(String name, String address, String phone, double salaryPerMonth) throws Exception {
	    try {
	    	Boss boss = new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss(), TaxesFactory.createTaxesRateBoss(), BonusFactory.createBonusRateBoss());
	        repository.addMember(boss);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createManager(String name, String address, String phone, double salaryPerMonth) throws Exception {
	    try {
	        Manager managerEmployee = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss(), TaxesFactory.createTaxesRateManager(), BonusFactory.createBonusManager());
	        repository.addMember(managerEmployee);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createSenior(String name, String address, String phone, double salaryPerMonth) throws Exception {
    	try {
	        Senior seniorEmployee = new Senior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss(), TaxesFactory.createTaxesRateSenior(), BonusFactory.createBonusRateEmployee());
	        repository.addMember(seniorEmployee);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
	}
	    
    public void createMid(String name, String address, String phone, double salaryPerMonth) throws Exception {
    	try {
	        Mid midEmployee = new Mid(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss(), TaxesFactory.createTaxesRateMid(), BonusFactory.createBonusRateMid());
	        repository.addMember(midEmployee);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createJunior(String name, String address, String phone, double salaryPerMonth) throws Exception {
    	try {
	        Junior juniorEmployee = new Junior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss(), TaxesFactory.createTaxesRateJunior(), BonusFactory.createBonusRateJunior());
	        repository.addMember(juniorEmployee);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createVolunteer(String name, String address, String phone, double salaryPerMonth) throws Exception {
        try {
	    	Volunteer volunteer = new Volunteer(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateVolunteer(), TaxesFactory.createTaxesRateVolunteer(), BonusFactory.createBonusRateVolunteer());
	        repository.addMember(volunteer);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }


    public void payAllEmployeers() {
        for (AbsStaffMember member : repository.getAllMembers()) member.pay();
    }
    

    public String getAllEmployees() {
        StringBuilder sb = new StringBuilder();
        for (AbsStaffMember member : repository.getAllMembers())
            sb.append(member.name).append("\n\tBruto mensual base: ").append(member.brutoMesBase).append("\n\tBruto mensual base + plus categoría: ").append(member.brutoMesPlus).append("\n\tBruto mensual base + plus categoría + bonus anual: ").append(member.brutoMesPlusBonus).append("\n\t\tNeto mensual total: ").append(member.netoMesTotal).append("\n\tBruto anual total: ").append(member.brutoYearTotal).append("\n\t\tNeto anual total: ").append(member.netoYearTotal).append("\n\tBeca (solo VOLUNTEERS): ").append(member.grant).append("\n\n");
        return sb.toString();
    }



}

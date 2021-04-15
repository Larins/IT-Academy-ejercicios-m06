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
	    	Boss boss = new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
	        repository.addMember(boss);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createManager(String name, String address, String phone, double salaryPerMonth) throws Exception {
	    try {
	        Manager managerEmployee = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
	        repository.addMember(managerEmployee);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createSenior(String name, String address, String phone, double salaryPerMonth) throws Exception {
    	try {
	        Senior seniorEmployee = new Senior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateSenior());
	        repository.addMember(seniorEmployee);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
	}
	    
    public void createMid(String name, String address, String phone, double salaryPerMonth) throws Exception {
    	try {
	        Mid midEmployee = new Mid(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateMid());
	        repository.addMember(midEmployee);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }
    
    public void createJunior(String name, String address, String phone, double salaryPerMonth) throws Exception {
    	try {
	        Junior juniorEmployee = new Junior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateJunior());
	        repository.addMember(juniorEmployee);
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
            sb.append(member.name).append(". Sueldo total: ").append(member.totalPaid).append("\n");
        return sb.toString();
    }

    public void createVolunteer(String name, String address, String phone, double salaryPerMonth) throws Exception {
        try {
	    	Volunteer volunteer = new Volunteer(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateVolunteer());
	        repository.addMember(volunteer);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "\nHas dicho que es de: " + salaryPerMonth + "€\n\n");	
		}
    }

}

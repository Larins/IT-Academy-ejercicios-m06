package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
    public JobsController() {
    	
    	repository = new EmployeeRepository();
    }

    public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
        repository.addMember(boss);
    }

    public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee employee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
        repository.addMember(employee);
    }

    public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee managerEmployee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
        repository.addMember(managerEmployee);
    }

    public void payAllEmployeers() {
        for (AbsStaffMember member : repository.getAllMembers()) member.pay();
    }

    public String getAllEmployees() {
        StringBuilder sb = new StringBuilder();
        for (AbsStaffMember member : repository.getAllMembers())
            sb.append(member.name).append(" : ").append(member.totalPaid).append("\n");
        return sb.toString();
    }

    public void createVolunteer(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Volunteer volunteer = new Volunteer(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateVolunteer());
        repository.addMember(volunteer);
    }

}

package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBoss("Pepe Boss", "Dirección molona", "666666666", 800);
		controller.createManager("Lara Manager", "Dirección molona", "666666666", 3500);
		controller.createSenior("Lara Senior", "Dirección molona", "666666666", 3000);
		controller.createMid("Lara Mid", "Dirección molona", "666666666", 1900);
		controller.createJunior("Lara Junior", "Dirección molona", "666666666", 1000);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", 0);

		
		
		//controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		//controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		//controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
		
	}

}

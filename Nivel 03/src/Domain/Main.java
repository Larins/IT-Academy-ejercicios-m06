package Domain;

public class Main {
	
	//En las clase EMPLOYEE hemos generado los atributos generales de los empleados
		//Incluido el SUELDO BASE general
	//En las otras clases de empleados hemos generado sus atributos específicos
		//Incluidos los MODIFICADORES DE SUELDO: bonus/minus, IRPF, ayudas del gobierno...
	//En esta clase MAIN vamos a:
		//Crear unos cuantos empleados de diferentes categorías
		//Calcular los SUELDOS NETOS Y BRUTOS, MENSUALES y ANUALES, de cada empleado

	public static void main(String[] args) {

		//BOSS
		Boss FranciscoBoss = new Boss();
		FranciscoBoss.name = "Francisco Boss";
		double GrossMonthSalaryBoss = Math.round(FranciscoBoss.BaseGrossMonthSalary * FranciscoBoss.PlusBoss);
		double NetMonthSalaryBoss = Math.round(GrossMonthSalaryBoss - (GrossMonthSalaryBoss * FranciscoBoss.RateIRPFBoss));
		double GrossYearSalaryBoss = Math.round((GrossMonthSalaryBoss * 12) * FranciscoBoss.BonusRate);
		double NetYearSalaryBoss = Math.round(GrossYearSalaryBoss - (GrossYearSalaryBoss * FranciscoBoss.RateIRPFBoss));
		
		System.out.println("Empleado: " + FranciscoBoss.name + "\n\tSueldo Mensual Bruto: " + GrossMonthSalaryBoss + " €\n\tSueldo Mensual Neto: " + NetMonthSalaryBoss + " €\n\tSueldo Anual Bruto: " + GrossYearSalaryBoss + " €\n\tSueldo Anual Neto: " + NetYearSalaryBoss + " €\n\tAyuda del gobierno: " + FranciscoBoss.GrantBoss + " €\n\t");
		
		//MANAGER
		Manager PedroManager = new Manager();
		PedroManager.name = "Pedro Manager";
		double GrossMonthSalaryManager = Math.round(PedroManager.BaseGrossMonthSalary * PedroManager.PlusManager);
		double NetMonthSalaryManager = Math.round(GrossMonthSalaryManager - (GrossMonthSalaryManager * PedroManager.RateIRPFManager));
		double GrossYearSalaryManager = Math.round((GrossMonthSalaryManager * 12) * PedroManager.BonusRate);
		double NetYearSalaryManager = Math.round(GrossYearSalaryManager - (GrossYearSalaryManager * PedroManager.RateIRPFManager));

		System.out.println("Empleado: " + PedroManager.name + "\n\tSueldo Mensual Bruto: " + GrossMonthSalaryManager + " €\n\tSueldo Mensual Neto: " + NetMonthSalaryManager + " €\n\tSueldo Anual Bruto: " + GrossYearSalaryManager + " €\n\tSueldo Anual Neto: " + NetYearSalaryManager + " €\n\tAyuda del gobierno: " + PedroManager.GrantManager + " €\n\t");
		
		//SENIOR
		Senior AlejandraSenior = new Senior();
		AlejandraSenior.name = "Alejandra Senior";
		double GrossMonthSalarySenior = Math.round(AlejandraSenior.BaseGrossMonthSalary * AlejandraSenior.PlusSenior);
		double NetMonthSalarySenior = Math.round(GrossMonthSalarySenior - (GrossMonthSalarySenior * AlejandraSenior.RateIRPFSenior));
		double GrossYearSalarySenior = Math.round((GrossMonthSalarySenior * 12) * AlejandraSenior.BonusRate);
		double NetYearSalarySenior = Math.round(GrossYearSalarySenior - (GrossYearSalarySenior * AlejandraSenior.RateIRPFSenior));

		System.out.println("Empleado: " + AlejandraSenior.name + "\n\tSueldo Mensual Bruto: " + GrossMonthSalarySenior + " €\n\tSueldo Mensual Neto: " + NetMonthSalarySenior + " €\n\tSueldo Anual Bruto: " + GrossYearSalarySenior + " €\n\tSueldo Anual Neto: " + NetYearSalarySenior + " €\n\tAyuda del gobierno: " + AlejandraSenior.GrantSenior + " €\n\t");
		
		//MID
		Mid ErmensindaMid = new Mid();
		ErmensindaMid.name = "Ermensinda Mid";
		double GrossMonthSalaryMid = Math.round(ErmensindaMid.BaseGrossMonthSalary * ErmensindaMid.PlusMid);
		double NetMonthSalaryMid = Math.round(GrossMonthSalaryMid - (GrossMonthSalaryMid * ErmensindaMid.RateIRPFMid));
		double GrossYearSalaryMid = Math.round((GrossMonthSalaryMid * 12) * ErmensindaMid.BonusRate);
		double NetYearSalaryMid = Math.round(GrossYearSalaryMid - (GrossYearSalaryMid * ErmensindaMid.RateIRPFMid));

		System.out.println("Empleado: " + ErmensindaMid.name + "\n\tSueldo Mensual Bruto: " + GrossMonthSalaryMid + " €\n\tSueldo Mensual Neto: " + NetMonthSalaryMid + " €\n\tSueldo Anual Bruto: " + GrossYearSalaryMid + " €\n\tSueldo Anual Neto: " + NetYearSalaryMid + " €\n\tAyuda del gobierno: " + ErmensindaMid.GrantMid + " €\n\t");
		
		//JUNIOR
		Junior CarlotaJunior = new Junior();
		CarlotaJunior.name = "Carlota Junior";
		double GrossMonthSalaryJunior = Math.round(CarlotaJunior.BaseGrossMonthSalary * CarlotaJunior.PlusJunior);
		double NetMonthSalaryJunior = Math.round(GrossMonthSalaryJunior - (GrossMonthSalaryJunior * CarlotaJunior.RateIRPFJunior));
		double GrossYearSalaryJunior = Math.round((GrossMonthSalaryJunior * 12) * CarlotaJunior.BonusRate);
		double NetYearSalaryJunior = Math.round(GrossYearSalaryJunior - (GrossYearSalaryJunior * CarlotaJunior.RateIRPFJunior));

		System.out.println("Empleado: " + CarlotaJunior.name + "\n\tSueldo Mensual Bruto: " + GrossMonthSalaryJunior + " €\n\tSueldo Mensual Neto: " + NetMonthSalaryJunior + " €\n\tSueldo Anual Bruto: " + GrossYearSalaryJunior + " €\n\tSueldo Anual Neto: " + NetYearSalaryJunior + " €\n\tAyuda del gobierno: " + CarlotaJunior.GrantJunior + " €\n\t");
		
		//VOLUNTEER
		Volunteer JuanVolunteer = new Volunteer();
		JuanVolunteer.name = "Juan Volunteer";
		double GrossMonthSalaryVolunteer = Math.round(JuanVolunteer.BaseGrossMonthSalary * JuanVolunteer.PlusVolunteer);
		double NetMonthSalaryVolunteer = Math.round(GrossMonthSalaryVolunteer - (GrossMonthSalaryVolunteer * JuanVolunteer.RateIRPFVolunteer));
		double GrossYearSalaryVolunteer = Math.round((GrossMonthSalaryVolunteer * 12) * JuanVolunteer.BonusRate);
		double NetYearSalaryVolunteer = Math.round(GrossYearSalaryVolunteer - (GrossYearSalaryVolunteer * JuanVolunteer.RateIRPFVolunteer));

		System.out.println("Empleado: " + JuanVolunteer.name + "\n\tSueldo Mensual Bruto: " + GrossMonthSalaryVolunteer + " €\n\tSueldo Mensual Neto: " + NetMonthSalaryVolunteer + " €\n\tSueldo Anual Bruto: " + GrossYearSalaryVolunteer + " €\n\tSueldo Anual Neto: " + NetYearSalaryVolunteer + " €\n\tAyuda del gobierno: " + JuanVolunteer.GrantVolunteer + " €\n\t");
		
	}
}

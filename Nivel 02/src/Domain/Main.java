package Domain;

public class Main {
	
	//En las clase EMPLOYEE hemos generado los atributos generales de los empleados
	//En las otras clases de empleados hemos generado sus atributos específicos
	//En esta clase MAIN vamos a crear unos cuantos empleados de diferentes categorías
	//Vamos a pintar sus atributos
	//Vamos a comprobar que su sueldo se ajusta a su categoría
			//El sueldo esta calculado de la siguiente manera
			//En la clase EMPLOYEE se le da un valor al sueldo base (SALARY)
			//En las otras clases de empleados se da un valor a los modificadores por categoría (por ejemplo PLUSBOSS)
			//En esta clase MAIN calculamos el sueldo como SALARY*PLUSSBOSS
			//Si se quieren hacer comprobaciones del sistema de validación, se puede cambiar el valor de SALARY desde la clase EMPLOYEE

	public static void main(String[] args) {

		Boss FranciscoBoss = new Boss();
		FranciscoBoss.name = "Francisco Boss";
		FranciscoBoss.address = "Calle Molona Bla Bla";
		FranciscoBoss.phone = "123456789";

		Manager PedroManager = new Manager();
		PedroManager.name = "Pedro Employee";
		PedroManager.address = "Calle Molona Bla Bla";
		PedroManager.phone = "123456789";

		Senior AlejandraSenior = new Senior();
		AlejandraSenior.name = "Alejandra Senior";
		AlejandraSenior.address = "Calle Molona Bla Bla";
		AlejandraSenior.phone = "123456789";

		Mid ErmensindaMid = new Mid();
		ErmensindaMid.name = "Ermensinda Mid";
		ErmensindaMid.address = "Calle Molona Bla Bla";
		ErmensindaMid.phone = "123456789";

		Junior CarlotaJunior = new Junior();
		CarlotaJunior.name = "Carlota Junior";
		CarlotaJunior.address = "Calle Molona Bla Bla";
		CarlotaJunior.phone = "123456789";

		Volunteer JuanVolunteer = new Volunteer();
		JuanVolunteer.name = "Juan Volunteer";
		JuanVolunteer.address = "Calle Molona Bla Bla";
		JuanVolunteer.phone = "123456789";

		//BOSS
		System.out.println("Empleado: " + FranciscoBoss.name + "\tDir: " + FranciscoBoss.address + "\tTel: "
				+ FranciscoBoss.phone + "\t\tSueldo: " + FranciscoBoss.Salary * FranciscoBoss.PlusBoss + " €\t");
		if (FranciscoBoss.Salary * FranciscoBoss.PlusBoss>8000){
			System.out.println("El sueldo está en la franja correcta\n");
		}else{
			System.out.println("El sueldo es incorrecto\nDebería ser superior a 8000€\n");}
		
		//MANAGER
		System.out.println("Empleado: " + PedroManager.name + "\tDir: " + PedroManager.address + "\tTel: "
				+ PedroManager.phone + "\t\tSueldo: " + PedroManager.Salary * PedroManager.PlusManager + " €\t");
		if (PedroManager.Salary * PedroManager.PlusManager>3000 && PedroManager.Salary * PedroManager.PlusManager<5000){
			System.out.println("El sueldo está en la franja correcta\n");
		}else{
			System.out.println("El sueldo es incorrecto\nDebería estar entre 3000€ y 5000€\n");}
		
		//SENIOR
		System.out.println("Empleado: " + AlejandraSenior.name + "\tDir: " + AlejandraSenior.address + "\tTel: "
				+ AlejandraSenior.phone + "\t\tSueldo: " + AlejandraSenior.Salary * AlejandraSenior.PlusSenior + " €\t");
		if (AlejandraSenior.Salary * AlejandraSenior.PlusSenior>2700 && AlejandraSenior.Salary * AlejandraSenior.PlusSenior<4000){
			System.out.println("El sueldo está en la franja correcta\n");
		}else{
			System.out.println("El sueldo es incorrecto\nDebería estar entre 2700€ y 4000€\n");}
		
		//MID
		System.out.println("Empleado: " + ErmensindaMid.name + "\tDir: " + ErmensindaMid.address + "\tTel: "
				+ ErmensindaMid.phone + "\t\tSueldo: " + ErmensindaMid.Salary * ErmensindaMid.PlusMid + " €\t");
		if (ErmensindaMid.Salary * ErmensindaMid.PlusMid>1800 && ErmensindaMid.Salary * ErmensindaMid.PlusMid<2500){
			System.out.println("El sueldo está en la franja correcta\n");
		}else{
			System.out.println("El sueldo es incorrecto\nDebería estar entre 1800€ y 2500€\n");}
		
		//JUNIOR
		System.out.println("Empleado: " + CarlotaJunior.name + "\tDir: " + CarlotaJunior.address + "\tTel: "
				+ CarlotaJunior.phone + "\t\tSueldo: " + CarlotaJunior.Salary * CarlotaJunior.PlusJunior + " €\t");
		if (CarlotaJunior.Salary * CarlotaJunior.PlusJunior>900 && CarlotaJunior.Salary * CarlotaJunior.PlusJunior<1600){
			System.out.println("El sueldo está en la franja correcta\n");
		}else{
			System.out.println("El sueldo es incorrecto\nDebería estar entre 900€ y 1600€\n");}
		
		//VOLUNTEER
		System.out.println("Empleado: " + JuanVolunteer.name + "\tDir: " + JuanVolunteer.address + "\tTel: "
				+ JuanVolunteer.phone + "\t\tSueldo: " + JuanVolunteer.Salary * JuanVolunteer.PlusVolunteer + " €\t");
		if (JuanVolunteer.Salary * JuanVolunteer.PlusVolunteer<=0){
			System.out.println("El sueldo está en la franja correcta");
		}else{
			System.out.println("El sueldo es incorrecto\nDebería ser inferior a 0€\n");}

		
	}

}

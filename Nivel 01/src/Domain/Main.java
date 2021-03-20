package Domain;

public class Main {

	public static void main(String[] args) {

		Boss PepeBoss = new Boss();
		PepeBoss.name = "Pepe Boss";
		PepeBoss.address = "Calle Molona Bla Bla";
		PepeBoss.phone = "123456789";

		Manager PedroManager = new Manager();
		PedroManager.name = "Pedro Employee";
		PedroManager.address = "Calle Molona Bla Bla";
		PedroManager.phone = "123456789";

		Volunteer JuanVolunteer = new Volunteer();
		JuanVolunteer.name = "Juan Volunteer";
		JuanVolunteer.address = "Calle Molona Bla Bla";
		JuanVolunteer.phone = "123456789";

		System.out.println("Empleado: " + PepeBoss.name + "\nDir: " + PepeBoss.address + "\nTel: " + PepeBoss.phone
				+ "\nSueldo: " + PepeBoss.Salary * PepeBoss.PlusBoss + " €\n");
		System.out.println("Empleado: " + PedroManager.name + "\nDir: " + PedroManager.address + "\nTel: "
				+ PedroManager.phone + "\nSueldo: " + PedroManager.Salary * PedroManager.PlusManager + " €\n");
		System.out.println("Empleado: " + JuanVolunteer.name + "\nDir: " + JuanVolunteer.address + "\nTel: "
				+ JuanVolunteer.phone + "\nSueldo: " + JuanVolunteer.Salary * JuanVolunteer.PlusVolunteer + " €\n");

	}

}

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

		Senior LauraSenior = new Senior();
		LauraSenior.name = "Laura Senior";
		LauraSenior.address = "Calle Molona Bla Bla";
		LauraSenior.phone = "123456789";

		Mid JosechuMid = new Mid();
		JosechuMid.name = "Josechu Mid";
		JosechuMid.address = "Calle Molona Bla Bla";
		JosechuMid.phone = "123456789";

		Junior MartaJunior = new Junior();
		MartaJunior.name = "Marta Junior";
		MartaJunior.address = "Calle Molona Bla Bla";
		MartaJunior.phone = "123456789";

		Volunteer JuanVolunteer = new Volunteer();
		JuanVolunteer.name = "Juan Volunteer";
		JuanVolunteer.address = "Calle Molona Bla Bla";
		JuanVolunteer.phone = "123456789";

		System.out.println("Empleado: " + PepeBoss.name + "\nDir: " + PepeBoss.address + "\nTel: " + PepeBoss.phone
				+ "\nSueldo: " + PepeBoss.Salary * PepeBoss.PlusBoss + " €\n");
		System.out.println("Empleado: " + PedroManager.name + "\nDir: " + PedroManager.address + "\nTel: "
				+ PedroManager.phone + "\nSueldo: " + PedroManager.Salary * PedroManager.PlusManager + " €\n");
		System.out.println("Empleado: " + LauraSenior.name + "\nDir: " + LauraSenior.address + "\nTel: "
				+ LauraSenior.phone + "\nSueldo: " + LauraSenior.Salary * LauraSenior.PlusSenior + " €\n");
		System.out.println("Empleado: " + JosechuMid.name + "\nDir: " + JosechuMid.address + "\nTel: "
				+ JosechuMid.phone + "\nSueldo: " + JosechuMid.Salary * JosechuMid.PlusMid + " €\n");
		System.out.println("Empleado: " + MartaJunior.name + "\nDir: " + MartaJunior.address + "\nTel: "
				+ MartaJunior.phone + "\nSueldo: " + MartaJunior.Salary * MartaJunior.PlusJunior + " €\n");
		System.out.println("Empleado: " + JuanVolunteer.name + "\nDir: " + JuanVolunteer.address + "\nTel: "
				+ JuanVolunteer.phone + "\nSueldo: " + JuanVolunteer.Salary * JuanVolunteer.PlusVolunteer + " €\n");

	}

}

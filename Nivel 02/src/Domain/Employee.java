package Domain;

//Esta clase no es un tipo de empleado, sino la categor�a padre con los elementos generales, comunes a todos lo empleados.

public class Employee {
	
	public String name;
	public String address;
	public String phone;
	
	//Suponemos un sueldo base de 1000� para todos los empleados.
	//Cada tipo de empleado heredar� este sueldo base.
	//Cada tipo de empleado tiene en su clase un modificador de sueldo seg�n su rango en la jerarqu�a de la empresa.
			//Por ejemplo: la clase BOSS tiene un modificador de 1.5 porque su sueldo debe ser un 50% mayor.
	//En la clase MAIN multiplicaremos el sueldo base por el modificador para ver su sueldo final.
	//Este sueldo final nos servir� para ver si se cumple la condici�n de sueldo.
			//Por ejemplo: la clase BOSS deber�a tener un sueldo superior a 8000�.
	
	double Salary = 3000;
	
}

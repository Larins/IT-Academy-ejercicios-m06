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
	
	//Le cambiamos el nombre de SALARY (que us�bamos en el nivel 2) por BASEGROSSMONTHSALARY (sueldo base mensual bruto)
	
	double BaseGrossMonthSalary = 3000;
	
	//Ponemos el BONUS en la clase padre EMPLOYEE aunque el VOLUNTEER no vaya a tener bonus.
	//Motivo: el BONUS es un % que se multiplica por el SALARY, en VOLUNTEER el SALARY = 0.
	
	double BonusRate = 1.1;
	
	//Contemplaremos en cada clase hijo otras variables como el IRPF o la beca gubernamental.
	
}

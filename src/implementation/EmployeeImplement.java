package implementation;

import java.util.List;

import objectExplained.Employee;
import objectExplained.EmployeeInterface;

public class EmployeeImplement implements EmployeeInterface {

	@Override
	public boolean verifChaine(String ch) {
		// TODO Auto-generated method stub
		return !ch.isEmpty();
	}

	@Override
	public boolean verifNom(String nom) {
		// TODO Auto-generated method 
// regex ou expression réguliére
		String regularEx="[A-Z a-z]+";
		
		return nom.matches(regularEx);
	}

	@Override
	public boolean verifAdresse(String adresse) {
		// TODO Auto-generated method stub
		return adresse.length()>10;
	}

	@Override
	public String ancienteEmployee(int Anciente) {
		// TODO Auto-generated method stub
		if(Anciente<=2)
			return "junior"; // {} sont facultatif => une  seule instruction
		else if(Anciente<=5)
			return "confirmé";
		else
		return "sénior";
	}

	@Override
	public boolean verifAge(int age) {
		// TODO Auto-generated method stub
		return age>20;
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> readEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}

package objectExplained;

import java.util.List;

public interface EmployeeInterface {
public boolean verifChaine(String ch);  
public boolean verifNom(String nom);
public boolean verifAdresse(String adresse);
public String ancienteEmployee(int Anciente); // junior senior confirmé
public boolean verifAge(int age);
public void createEmployee(Employee employee); // camelCase
public void deleteEmployee(Employee employee); // camelCase
public void updateEmployee(Employee employee); // camelCase
public List<Employee> readEmployees();
}

package objectExplained;

public class Employee {
private String nom,prenom,adresse,email;
private int age,anciente;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getAnciente() {
	return anciente;
}
public void setAnciente(int anciente) {
	this.anciente = anciente;
}
@Override
public String toString() {
	return "Employee [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email=" + email + ", age=" + age
			+ ", anciente=" + anciente + "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String nom, String prenom, String adresse, String email, int age, int anciente) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.email = email;
	this.age = age;
	this.anciente = anciente;
}
// ceci est un POJO (plain old java Object) 
// validation du nom (non null et contient seulement des lettres)
// validation de email c'est un email valide
// age > 20
// adresse longueur > 10 et contient au moins un espace
// evaluation de ancienté ( 0-2) junior 2-5 confirmé +5 senior
// simulation de CRUD






}

package sample;
interface Employee{
	abstract void EmployeeDetails();
	
}
class Empid implements Employee {
	public void EmployeeDetails(){
		System.out.println("Empid:komalareddygumpu29@gmail.com");
	}
}

class Empname implements Employee{
	public void EmployeeDetails() {
		System.out.println("Empname:Gumpu Komala");
	}
	
}

class EmpSal implements Employee{
	public void EmployeeDetails() {
	System.out.println("EmpSal:50000");	
	}
}

class EmpLoc implements Employee{
	public void EmployeeDetails() {
	System.out.println("EmpLoc:Andhra Pradesh,Chittoor District");	
	}
}

class EmpPhone implements Employee{
	public void EmployeeDetails() {
	System.out.println("EmpPhone:9393077019");	
	}
}
public class Emp_details {

	public static void main(String[] args) {
		Empid a = new Empid();
		a.EmployeeDetails();
		Empname b = new Empname();
		b.EmployeeDetails();
        EmpSal c = new EmpSal();
        c.EmployeeDetails();
        EmpLoc d = new EmpLoc();
        d.EmployeeDetails();
        EmpPhone e = new EmpPhone();
        e.EmployeeDetails();
        
	}

}

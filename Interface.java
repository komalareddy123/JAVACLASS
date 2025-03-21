package sample;


interface Animal{ // instance of class is interface and interfaces can accept only abstract methods
	abstract void sound();
}
class Horse implements Animal{ 
	public void sound() {
		System.out.println("WOOF WOOF WOOF");
	}
}	
class Tiger implements Animal{
	public void sound() {
		System.out.println("COO COO COO");
	}
}

public class Interface {

	public static void main(String[] args) {
		  Horse h = new Horse();
		  h.sound();
		 Tiger t = new Tiger();
		 t.sound();

	}

}

//using interface we need to display emp_details(Emp_id,Emp_name,Emp_sal,Emp_loc,Emp_phone)

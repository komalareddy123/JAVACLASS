package myjava;
class Modi{//user defined class
	
public int a = 100;
	
	protected int b = 200; 
	
	int c = 300;
	
	private String d;// in user define  class we cannot access the private key word
	
	public String getName() {
		return d; // getter method means to get the value
	}
	
	public void setName(String d) {
		this.d=d;//setter method means we are setting the value
		
	}
	
	
	
	
}

public class Modifiers {//main calss
	public int a = 100;//public means we can access any where
	
	protected int b = 200;//for protect we have to access in the particular package only
	
	int c = 300;//Default we are not using any key words
	
	private String d = "Sudhakar";
	
	

	public static void main(String[] args) {
		
		//Main class object
		
		Modifiers m=new Modifiers();
		System.out.println("a value :"+m.a);
		System.out.println("b value :"+m.b);
		System.out.println("c value :"+m.c);
		System.out.println("d value :"+m.d);
		
		
		//user define class object
		
		Modi m1=new Modi();
		System.out.println("a value :"+m1.a);
		System.out.println("b value :"+m1.b);
		System.out.println("c value :"+m1.c);
		m1.setName("Sudhakar");
		System.out.println("d value :"+m1.getName());


    

	}

}

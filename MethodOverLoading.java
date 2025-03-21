package myjava;
class Addition{	
	public void add() {
		int a=10;
		int b=20;
		System.out.println("Sum of a&b is :"+(a+b));
		
	}
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
	public String Fname(String fname){
		return fname;
	}
	public String Lname(String lname){
		return lname;
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		System.out.println("sum of a&b is:" +a.add(200,300));
		System.out.println("Sum of a&b&c is :" +a.add(200,300,400));
		System.out.println("My First name :" +a.Fname("komala Reddy"));
		System.out.println("My Last name :" +a.Lname("Gumpu"));
	}

}
//definetly have to pass parameter
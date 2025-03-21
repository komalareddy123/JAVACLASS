//polymorphism types 1)compile time(Method over loading) 2)run time

package javaclass2;

public class polymorphism {
	
	public static int add(int a, int b) {     //method 1
		return a+b;
	}
	
	public static int add(double a, double b) {     //method 2
		return a+b;
	}

	
	public static void main(String[] args) {
		
		System.out.println("method 1:" +add(10,20));
		System.out.println("method 2:" +add(100,200));

	}

}

//Run time polymorphism



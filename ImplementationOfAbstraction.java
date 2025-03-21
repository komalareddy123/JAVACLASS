//Implementation Of Abstraction

package javaclass2;

import java.util.Scanner;

abstract class Apps{   //abstract Parent class
	
	String user_name;
	String password;
	
	void user_input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username :");
		user_name = s.nextLine();
		System.out.println("Enter password :");
		password = s.nextLine();
	}
	
	void user_login() {
		System.out.println("WELCOME TO INSTAGRAM");
		System.out.println("-----------------------");
		System.out.println("Please Login Here....!!");
		
		

	}
	
	
	abstract void app_open();  //abstract method
	
}

class Instagram extends Apps{  //child class
	@Override
	void app_open() {  //normal method
		
		while(true) {
		
		if(user_name .equals("Komala") && password . equals("143@")) {
			System.out.println("SuccessFully Login, App is Open..!!");
			break;
		}else {
			System.out.println("Invalid username & password : Please try again..!!");
			user_input();
			
		}		
		}
	}
	
}

public class ImplementationOfAbstraction {

	public static void main(String[] args) {
		Instagram i = new Instagram();
		i.user_login();
		i.user_input();
		i.app_open();
		 

	}

}

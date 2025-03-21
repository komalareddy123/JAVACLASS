package javaclass2;
import java.util.Scanner;

abstract class app{   //Abstract parent class
	
	String phone_number;
	String otp;
	
	void user_input() {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Phone number : ");
		phone_number = o.nextLine();
		System.out.println("Enter otp: ");
		otp = o.nextLine();
	}
	
	void user_login() {
		System.out.println("WELCOME TO WHATSAPP");
		System.out.println("---------------------");
		System.out.println("Please Login Here...!");
	}
	
	abstract void app_open();     //Abstract method
}

class whats_app extends app{     //child class
	@Override
	void app_open() {       //normal method
		
		while(true) {
		
		if(phone_number.equals("9393077019") && otp.equals("290304")) {
			System.out.println("Successfully Login, App is open...!!");
			break;
		}
		else {
			System.out.println("Invalid username and password : Please try again!");
			user_input();
		}
		}
	}
}

public class Whatsapp {

	public static void main(String[] args) {
		whats_app w = new whats_app();
		w.user_login();
		w.user_input();
		w.app_open();
	}

}
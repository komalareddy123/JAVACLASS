package sample;

class Engine{  //Parent1
	void start() {
		System.out.println("Engine Start");
	}
	
}

class Car{    //Parent2
	Engine e = new Engine();
	void stop() {  
		System.out.println("Engine Stop");
		e.start();
	}
}

class Car1{
	Car c = new Car();
	void move() {
		System.out.println("Engine Move");
		
	}
	
}

public class Composition {

	public static void main(String[] args) {
		Car c = new Car();
		Car1 c1 = new Car1();
		c.stop();
		c1.move();
		

	}

}

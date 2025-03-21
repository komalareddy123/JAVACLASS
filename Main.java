package constructors;
class Fruits{//user define class
	Fruits(){//Default Constructor
		System.out.println("I am Default Constructor");
	}
	Fruits(String name){//Parameter Constructor
		System.out.println("I am Parameter Constructor");
		System.out.println("Fruit name :"+name);
	}
}
public class Main {//main class
	public static void main(String[] args) {
		Fruits f=new Fruits();
		Fruits f1=new Fruits("Orange");
	}
}


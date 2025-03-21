//Dynamic or late binding in polymorphism is the concept of method override
package javaclass2;

class Vehicles {  // parent class
    public void vehicles_details() {
    	System.out.println("vehicles_details");
    }
}

class car1 extends Vehicles { //child class
    @Override
    public void vehicles_details() {
        System.out.println("Car1_Name:Scarpio");
        System.out.println("Car1_Color:Black");
    }
}

class car2 extends Vehicles {
    @Override
    public void vehicles_details() {
        System.out.println("Car2_Name:Thar");
        System.out.println("Car2_Color:Red");
    }
}


public class Dynamic {

    public static void main(String[] args) {
        car1 c1 = new car1();
        c1.vehicles_details();
        car2 c2 = new car2();
        c2.vehicles_details();
    }
}

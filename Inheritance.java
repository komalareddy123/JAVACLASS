//package javaclass2;
//
//class Parent {
//    public void parent_method() {
//        System.out.println("I AM PARENT METHOD");
//    }
//}
//
//class Child1 extends Parent {
//    public void child_method() {
//        System.out.println("I AM CHILD METHOD");
//    }
//}
//
//class Child2 extends Parent {
//    public void child_method() {
//        System.out.println("I AM CHILD METHOD");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Child1 c = new Child1();
//        c.parent_method();
//        c.child_method();
//    }
//}

package javaclass2;

class Car {
    String car_name;
    String car_color;
    
    public void car_details() {
        System.out.println("I AM A CAR");
    }
}

class Car1 extends Car {
    Car1(String name, String color) {
        car_name = name;
        car_color = color;
    }
    
    @Override
    public void car_details() {
        System.out.println("Car1 Name: " + car_name);
        System.out.println("Car1 Color: " + car_color);
    }
}

class Car2 extends Car {
    Car2(String name, String color) {
        car_name = name;
        car_color = color;
    }
    
    @Override
    public void car_details() {
        System.out.println("Car2 Name: " + car_name);
        System.out.println("Car2 Color: " + car_color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Toyota", "Blue");
        car1.car_details();
        
        Car2 car2 = new Car2("Honda", "Red");
        car2.car_details();
    }
}

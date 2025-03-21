package javaclass2;

class Animal {  // Parent class
}

class Dog extends Animal { // Child class
}

public class InstanceOf {    //check the avaliabilty of class are not
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        
        System.out.println(a instanceof Animal);  
        System.out.println(d instanceof Dog);    
         
    }
}

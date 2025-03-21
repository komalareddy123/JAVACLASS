package javaclass2;

class Animal {
    public static void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    public static void sound() {
        System.out.println("BOW BOW");
    }
}

class Cat extends Animal {
    public static void sound() {
        System.out.println("MEOW MEOW");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        
        Cat c = new Cat();
        c.sound();
        
        // Demonstrating method hiding
        Animal a1 = new Dog();
        a1.sound(); // This will call Animal's sound method

        Animal a2 = new Cat();
        a2.sound(); // This will call Animal's sound method
    }
}

//Polymorphism allows us to adapt methods in common between super and sub classes =)
class Person {
    public void sayHello() {
        System.out.println("A person says hello!");
    }
}

class German extends Person {
    public void sayHello() {
        System.out.println("Hallo!");
    }
}

class Brazilian extends Person {
    public void sayHello() {
        System.out.println("E ai meu consagrado!");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Person person = new Person();
        German german = new German();
        Brazilian brazilian = new Brazilian();
        person.sayHello();
        german.sayHello();
        brazilian.sayHello();
    }
}

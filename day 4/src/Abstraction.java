abstract class Abstraction {
    public abstract void doSomething(); //This is an abstract method which is going to be overidden
}

class AbstractionChild1 extends Abstraction {
    public void doSomething() { //Override moment
        System.out.println("Woah! I'm doing something...");
    }
}

class AbstractionChild2 extends Abstraction {

    short a = 5;
    short b = 7;

    public void doSomething() {
        System.out.println(a + b);
    }
}
interface Bird { //This is an interface
    public abstract void shitOnPeople(); //Has an abstract method
}

class Parrot implements Bird { //These classes ain't going to inherit anything. They'll rather be composed.
    public void fly() {
        System.out.println("I'm a Parrot. I can fly!");
    }

    public void shitOnPeople() {
        System.out.println("Parrot: Shitting on people is awesome =)");
    }
}

class Penguin implements Bird {
    public void shitOnPeople() {
        System.out.println("Penguin: Well i suppose I could shit on ya too if I wanted");
    }
    public void swim() {
        System.out.println("I'm a Penguin. I can swim like an olympic athlete!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Parrot louro = new Parrot();
        Penguin pingu = new Penguin();
        louro.fly();
        louro.shitOnPeople();
        pingu.swim();
        pingu.shitOnPeople();
    }
}

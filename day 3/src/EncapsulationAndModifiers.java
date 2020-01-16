final class EncapsulationAndModifiers { //Have used final so this can't produce subclasses

    private String[] planesList = {}; //Declares an empty array of planes

    public static void main (String[] args) { //The main method
        EncapsulationAndModifiers encapsulationAndModifiers = new EncapsulationAndModifiers();

        //I Know this looks ugly, remember it's just for fun!
        Boeing tripleSeven = new Boeing("Jet", (short) 220, "777");
        Airbus a330 = new Airbus("Jet", (short) 200, "A330");
        String[] tempPlaneList = {tripleSeven.getModel(), a330.getModel()};
        encapsulationAndModifiers.setPlanesList(tempPlaneList);
        printPlanesList(encapsulationAndModifiers.getPlanesList());
    }

    //Prints planes on the console
    static void printPlanesList(String[] planesList) {
        for(int i = 0; i< planesList.length; i++) {
            System.out.println(planesList[i]);
        }
    }

    public void setPlanesList(String[] planesList) {
        this.planesList = planesList;
    }

    public String[] getPlanesList() {
        return planesList;
    }
}

abstract class Plane { //The abstract class Plane can't have objects instantiated from it.

    private String type;
    private short seats;

    public Plane(String type, short seats) {
        this.type = type;
        this.seats = seats;
    }

    public short getSeats() {
        return seats;
    }

    public String getType() {
        return type;
    }
}

//This class doesn't have modifiers like PUBLIC or PRIVATE, therefore it's accessible to all classes in this package.
class Boeing extends Plane { //this class inherits attributes and methods from its superclass, Plane.

    private String model;

    public Boeing(String type, short seats, String model) {
        super(type, seats);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Airbus extends Plane { //Same as Boeing
    private String model;

    public Airbus(String type, short seats, String model) {
        super(type, seats);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
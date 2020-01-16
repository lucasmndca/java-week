public class Constructor { //The idea here is simply to play around with constructors.

    String name;
    String surname;
    int age;

    public Constructor(String name, String surname, int age) { //Automatically sets these attributes upon instantiation
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main (String[] args) {
        //Declares two objects. One of them doesn't have a surname
        Constructor constructor = new Constructor("Lucas", "Dias", 23);
        Constructor constructor1 = new Constructor("Joseph", "", 15);
        checkIfParameterHasAllAttributesSet(constructor);
        checkIfParameterHasAllAttributesSet(constructor1);
    }

    static void checkIfParameterHasAllAttributesSet(Constructor constructor) {
        if(constructor.name == "") {
            System.out.println("Name is missing for " + constructor);
        } else if(constructor.surname == "") {
            System.out.println("Surname is missing for " + constructor);
        } else {
            System.out.println("Constructor " + constructor + " is okay to be saved!");
        }
    }
}

public class Arrays {

    public static void main(String[] args) {
        String[] people = {"Matt", "Yenniffer", "Paula"}; //Declares an array which contains 3 names
        printPeople(people); //Invokes a method
    }

    private static void printPeople(String[] people) { //Prints all names on the console
        boolean isArrayPrinted = false;
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            checkIfArrayIsPrinted(isArrayPrinted);
            if(i + 1 == people.length - 1) {
                isArrayPrinted = true;
            }
        }
    }

    private static void checkIfArrayIsPrinted(boolean isArrayPrinted) {
        if(!isArrayPrinted) {
            System.out.println("Your array hasn't been fully printed yet");
        } else {
            System.out.println("Success! Your array has been fully printed!");
        }
    }
}

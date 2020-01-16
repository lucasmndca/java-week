public class Methods { //Getters & Setters will be used in this exercise
    private long anyNumber;

    public static void main (String[] args) {
        Methods method = new Methods(); //Instantiates a new Methods object
        long randomNumber = (long) (Math.random() * 100); //Generates a random number
        method.setAnyNumber(randomNumber);
        method.printNumberOnConsole(method.getAnyNumber());
    }

    public void setAnyNumber(long anyNumber) {
        this.anyNumber = anyNumber;
    }

    public long getAnyNumber() {
        return anyNumber;
    }

    public void printNumberOnConsole(long randomNumber) {
        if(anyNumber > 75) {
            System.out.println("Woah! You got a pretty high number");
        } else if(anyNumber > 50) {
            System.out.println("You got an OK number!");
        } else {
            System.out.println("Damn, good luck next time...");
        }
    }
}

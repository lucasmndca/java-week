import java.util.Date;

public class Strings {
    public static void main(String[] args) {
        createStrings();
    }

    static void createStrings() {
        String start = "Hello, my name is ";
        String end = " and it is nice to meet you"; //instantiates two String;
        System.out.println(completeSentence(start, end)); //Calls the method completeSentence() to be printed
        System.out.println(start.toUpperCase().trim());
        System.out.println(end.toLowerCase().trim());
        printStringAccordingToNumber(2); //pass your parameter here. I'll pass 2 by default
    }

    private static String completeSentence(String start, String end) { //String before the method's name indicates it's gonna return some String
        //It is required to inform what type your parameters are in JAVA, just like the example above.
        return start + "Lucas" + end; //method returns something
    }

    private static void printStringAccordingToNumber(int number) {
        if(number > 10) {
            System.out.println("Harry!");
        } else {
            System.out.println("Larry");
        }
    }
}

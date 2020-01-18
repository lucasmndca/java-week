import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample {

    public static void main(String[] args) {
        mainMenu();
    }

    static void mainMenu() {
        ArrayListExample arrayList = new ArrayListExample();
        ArrayList<String> bikes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        byte counter = 0;
        while(counter != 1) {
            System.out.println(BikeConstants.BIKE_ENTER);
            bikes.add(scanner.nextLine());
            System.out.println(BikeConstants.BIKE_ADD);
            if(scanner.nextLine().toUpperCase().equals(OptionsENUM.NO.toString())) {
                counter = 1;
            }
        }

        arrayList.printBikeList(bikes);
    }

    public void printBikeList(ArrayList<String> bikes) {
        for(short i = 0; i < bikes.size(); i++) {
            System.out.println(BikeConstants.BIKE_OPEN +
                    i + BikeConstants.BIKE_CLOSE +
                    bikes.get(i)
                    );
        }
    }
}

enum OptionsENUM {
    YES,
    NO
}

abstract class BikeConstants {
    public final static String BIKE_ENTER = "\nEnter a bike name: ";
    public final static String BIKE_ADD = "Would you like to add more bikes? [YES/NO]";
    public final static String BIKE_OPEN = "Bike( ";
    public final static String BIKE_CLOSE = " ): ";
}

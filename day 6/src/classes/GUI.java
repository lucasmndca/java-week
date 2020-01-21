package classes;

import constants.GUIConstants;
import constants.GUIEnum;

import java.util.Date;
import java.util.Scanner;

public class GUI {

    //Prints the app's title
    static void printTitle() {
        System.out.println(GUIConstants.GUI_INTRO);
    }
     //Ask users to input their entry type (Reminders or Appointments)
    static void printEntryType() {
        System.out.println(GUIConstants.GUI_ENTRY_TYPE);
    }

    //Prints a generic error on console.
    static void printDefaultError() {
        System.out.println(GUIConstants.GUI_DEFAULT_ERROR);
    }

    //Asks users to input a title.
    static void printGetNameMessage(String complement) {
            System.out.println(GUIConstants.GUI_GET_NAME +
                    complement);
    }

    //Asks users to input a description.
    static void printGetDescription(String complement) {
        System.out.println(GUIConstants.GUI_GET_DESCRIPTION +
                complement);
    }

    //Instantiates an Appointment object
    static void addAppointment(Scanner scanner, Date date) {
        Appointment appointment = new Appointment();
        printGetNameMessage(GUIConstants.APPOINTMENT);
        appointment.setName(scanner.nextLine());

        printGetDescription(GUIConstants.APPOINTMENT);

        addTodoElementsToList(appointment, null);
    }

    //Instantiates a Reminder object
    static void addReminder(Scanner scanner, Date date) {
        Reminder reminder = new Reminder();
        printGetNameMessage(GUIConstants.REMINDER);
        reminder.setName(scanner.nextLine());

        printGetDescription(GUIConstants.REMINDER);
        reminder.setDescription(scanner.nextLine());

        addTodoElementsToList(null, reminder);
    }

    //Adds either to the elements list
    static void addTodoElementsToList(Appointment appointment, Reminder reminder) {
        System.out.println("Hello111");
    }

    //Out main method
    public static void main(String[] args) {
        startApp();
    }

    //Our main loop (Main menu)
    static void startApp() {
        String userResponse = "";
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        printTitle();

        while(!userResponse.toUpperCase().equals(GUIEnum.S.toString())) {
            printEntryType();
            userResponse = scanner.nextLine();
            if(userResponse.equals(GUIEnum.C)) {
                addAppointment(scanner, date);
            } else if(userResponse.equals(GUIEnum.L.toString())) {
                addReminder(scanner, date);
            } else {
                printDefaultError();
            }
        }
    }
}

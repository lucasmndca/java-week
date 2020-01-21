package classes;

import constants.GUIConstants;
import constants.GUIEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GUI {

    private ArrayList<Reminder> reminders;
    private ArrayList<Appointment> appointments;

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setReminders(ArrayList<Reminder> reminders) {
        this.reminders = reminders;
    }

    public ArrayList<Reminder> getReminders() {
        return reminders;
    }

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

    //Asks users to input a date.
    static void printGetDate(String complement) {
        System.out.println(GUIConstants.GUI_GET_DATE +
                complement + GUIConstants.GUI_GET_DATE_OPTIONS);
    }

    //Asks to input a location into your appointment register
    static void printGetLocation() {
        System.out.println(GUIConstants.GUI_GET_LOCATION);
    }

    //Validates the date chosen by the user
    static void validateDate(Appointment appointment, Reminder reminder, String chosenDate) {
        String translatedDate = "";
        switch (chosenDate) {
            case "D":
                translatedDate = GUIConstants.DATE_ONE_DAY.toString();
                break;
            case "W":
                translatedDate = GUIConstants.DATE_ONE_MONTH.toString();
                break;
            case "M":
                translatedDate = GUIConstants.DATE_ONE_WEEK.toString();
                break;
            default:
                printDefaultError();
                break;
        }
        registerNotificationDate(appointment, reminder, translatedDate);
    }

    //Sets the date input above
    static void registerNotificationDate(Appointment appointment, Reminder reminder, String chosenDate) {
        if(appointment != null) {
            appointment.setDate(chosenDate);
        } else {
            reminder.setDate(chosenDate);
        }
    }

    //Instantiates an Appointment object
    static void addAppointment(Scanner scanner, Date date) {
        Appointment appointment = new Appointment();
        printGetNameMessage(GUIConstants.APPOINTMENT);
        appointment.setName(scanner.nextLine());

        printGetDescription(GUIConstants.APPOINTMENT);
        appointment.setDescription(scanner.nextLine());

        printGetDate(GUIConstants.APPOINTMENT);
        validateDate(appointment, null, scanner.nextLine());

        printGetLocation();
        appointment.setLocation(scanner.nextLine());

        addTodoElementsToList(appointment, null);
    }

    //Instantiates a Reminder object
    static void addReminder(Scanner scanner, Date date) {
        Reminder reminder = new Reminder();
        printGetNameMessage(GUIConstants.REMINDER);
        reminder.setName(scanner.nextLine());

        printGetDescription(GUIConstants.REMINDER);
        reminder.setDescription(scanner.nextLine());

        printGetDate(GUIConstants.REMINDER);
        validateDate(null, reminder, scanner.nextLine());

        addTodoElementsToList(null, reminder);
    }

    //Adds either to the elements list
    static void addTodoElementsToList(Appointment appointment, Reminder reminder) {
        GUI gui = new GUI();

        if(appointment != null) {
            ArrayList<Appointment> appointments = gui.getAppointments();
            appointments.add(appointment);
            gui.setAppointments(appointments);
            System.out.println(GUIConstants.APPOINTMENT_SAVED);
        } else {
            ArrayList<Reminder> reminders = gui.getReminders();
            reminders.add(reminder);
            gui.setReminders(reminders);
            System.out.println(GUIConstants.REMINDER_SAVED);
        }
    }

    static void shouldListBePrinted(Scanner scanner) {
        System.out.println(GUIConstants.GUI_PRINT_LIST);
        validateAndDecideShouldListBePrinted(scanner.nextLine());
    }

    static void validateAndDecideShouldListBePrinted(String answer) {
        if(answer.toUpperCase().equals(GUIEnum.Y.toString())) {

            GUI gui = new GUI();

            if(gui.getReminders() != null) {

                ArrayList<Reminder> reminders = gui.getReminders();
                System.out.println(GUIConstants.REMINDERS);

                for (int i = 0; i < reminders.size(); i++) {
                    System.out.println(reminders.get(i).getName());
                    System.out.println(reminders.get(i).getDescription());
                    System.out.println(reminders.get(i).getDate() + "\n");
                }

            } if (gui.getAppointments() != null) {
                ArrayList<Appointment> appointments = gui.getAppointments();
                System.out.println(GUIConstants.APPOINTMENTS);
                for (int i = 0; i < appointments.size(); i++) {
                    System.out.println(appointments.get(i).getName());
                    System.out.println(appointments.get(i).getDescription());
                    System.out.println(appointments.get(i).getDate());
                    System.out.println(appointments.get(i).getLocation() + "\nj");
                }
            }
        }
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
                shouldListBePrinted(scanner);
            } else if(userResponse.equals(GUIEnum.L.toString())) {
                addReminder(scanner, date);
                shouldListBePrinted(scanner);
            } else {
                printDefaultError();
            }
        }
    }
}

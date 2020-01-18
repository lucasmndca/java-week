import java.time.LocalDate; // import the LocalDate class
import java.time.format.DateTimeFormatter;

class Constants {
    public static final String PRINT_YEAR_MESSAGE = "Year: ";
    public static final String PRINT_MONTH_MESSAGE = "Month: ";
    public static final String PRINT_DAY_MESSAGE = "Date: ";
}

public class Date {
        public static void main(String[] args) {
            System.out.println("This software prints your current date.\n");
            LocalDate localDate = LocalDate.now(); // Create a date object
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            String formattedDate = localDate.format(dateTimeFormatter);
            cutYear(formattedDate);
            cutMonth(formattedDate);
            cutDay(formattedDate);
        }

        static void cutYear(String formattedDate) {
            String cutYearFinal = formattedDate.substring(6);
            printOnConsole(Constants.PRINT_YEAR_MESSAGE, cutYearFinal);
        }

         static void cutMonth(String formattedDate) {
            String cutYearFinal = formattedDate.substring(3, 5);
            printOnConsole(Constants.PRINT_MONTH_MESSAGE, cutYearFinal);
        }

         static void cutDay(String formattedDate) {
            String cutYearFinal = formattedDate.substring(0, 2);
            printOnConsole(Constants.PRINT_DAY_MESSAGE, cutYearFinal);
        }

        static void printOnConsole(String constant, String finalDate) {
            System.out.println(constant + finalDate);
        }
}

public class Math {
    public static void main(String[] args) {
        byte num1 = 10; //Declares two numbers
        byte num2 = 6;
        calculate(num1, num2, "upToFifity"); //Calls the calculate function
    }

    private static void calculate(byte num1, byte num2, String operation) {
        switch (operation) {
            case "upToFifity": //calculates numbers up to 50
                byte result = 0;
                while(result < 50){
                    result += num1 + num2;
                    System.out.println(result);
                }
                break;
            case "addition": //adds parameters
                System.out.println(num1 + num2);
                break;
            case "subtraction": //subtracts parameters
                System.out.println(num1 - num2);
                break;
            default:
                break;
        }
    }
}

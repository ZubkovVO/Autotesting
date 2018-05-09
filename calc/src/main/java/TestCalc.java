import java.util.Scanner;

public class TestCalc {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        double a, b, result = 0;
        boolean check = false;
        String oper;
        String message = null;


        System.out.println("enter first digit");
        checkInputVal();
        a = keyboard.nextDouble();
        System.out.println("enter second digit");
        checkInputVal();
        b = keyboard.nextDouble();
        System.out.println("enter operation");
        oper = keyboard.next();
        switch (oper) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

            default:
                check = true;
                message = "Operation impossible in this version";
                break;

        }
        if (check == true) {
            System.out.println(message);
        } else {
            System.out.println(result);

        }
    }

    private static void checkInputVal(){
        while (!keyboard.hasNextDouble()){
            System.out.println("Please enter a number");
            keyboard.next();
        }
    }

}

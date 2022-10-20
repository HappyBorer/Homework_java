package homework_1;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double number = in.nextDouble();
        System.out.print("Input operation: ");
        String operation = in.next();
        System.out.print("Input second number: ");
        double number2 = in.nextDouble();
        double result;
        switch(operation){
            case "+":
                result = number + number2;
                System.out.printf("%.1f + %.1f = %.1f", number, number2, result);
                break;
            case "-":
                result = number - number2;
                System.out.printf("%.1f - %.1f = %.1f", number, number2, result);
                break;
            case "*":
                result = number * number2;
                System.out.printf("%.1f * %.1f = %.1f", number, number2, result);
                break;
            case "/":
                result = number / number2;
                System.out.printf("%.1f / %.1f = %.1f", number, number2, result);
                break;
            default:
                System.out.println("There is no such operation");
        }
    }
}

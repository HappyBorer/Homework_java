package homework_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print ("Input a number: ");
        int number = in.nextInt();
        var trianNumber = 0.5 * number * (number + 1);
        int factorial = 1;
        for(int i = 2; i <= number; i++){
           factorial *= i;
        }
        System.out.println("Triangular number is " + number + " = " + (int)trianNumber);
        System.out.println("Factorial " + number + " = " + factorial);
    }
}

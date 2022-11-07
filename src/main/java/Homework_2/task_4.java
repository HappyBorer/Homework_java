package Homework_2;

//К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.util.logging.Logger;

public class task_4 {
    public static void main(String[] args){
        Logger logger = Logger.getAnonymousLogger();

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double number = in.nextDouble();
        System.out.print("Input operation: ");
        String operation = in.next();
        System.out.print("Input second number: ");
        double number2 = in.nextDouble();
        logger.info(simpleCalculator(number, number2, operation));
    }

    public static String simpleCalculator(double number, double number2, String operation){
        double result;
        String str = new String();
        switch(operation) {
            case "+":
                result = number + number2;
                str = Double.toString(number).concat(" + ").concat(Double.toString(number2)).concat(" = ").concat(Double.toString(result));
                break;
            case "-":
                result = number - number2;
                str = Double.toString(number).concat(" - ").concat(Double.toString(number2)).concat(" = ").concat(Double.toString(result));
                break;
            case "*":
                result = number * number2;
                str = Double.toString(number).concat(" * ").concat(Double.toString(number2)).concat(" = ").concat(Double.toString(result));
                break;
            case "/":
                if(number2 == 0){
                    str = "Сan’t divide into zero";
                }else {
                    result = number / number2;
                    str = Double.toString(number).concat(" / ").concat(Double.toString(number2)).concat(" = ").concat(Double.toString(result));
                }
                break;
            default:
                str = "There is no such operation";
        }
        return str;
    }
}

package homework_4;

// В калькулятор добавьте возможность отменить последнюю операцию

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class task_3 {

  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) throws IOException, InterruptedException {
    Logger logger = Logger.getAnonymousLogger();
    boolean flag = true;
    char answer;
    while (flag) {
      logger.info(calculate(getNumber(), getNumber(), getOperation()));
      Thread.sleep(100);
      System.out.print("Exit?(Y/N): ");
      answer = in.next().charAt(0);
      if (Character.toUpperCase(answer) == 'Y') {
        flag = false;
      }
    }
  }

  public static double getNumber() throws IOException {
    System.out.print("Enter a number: ");
    double number;
    if (in.hasNextDouble()) {
      number = in.nextDouble();
      System.out.print("Continue?(Y/N): ");
      char choice = in.next().charAt(0);
      if (Character.toUpperCase(choice) == 'N') {
        number = getNumber();
      }
    } else {
      System.out.println("Error! Try again!");
      in.next();
      number = getNumber();
    }
    return number;
  }

  public static char getOperation() throws IOException {
    System.out.print("Enter a operation: ");
    char operation;
    if (in.hasNext()) {
      operation = in.next().charAt(0);
      System.out.print("Continue?(Y/N): ");
      char choice = in.next().charAt(0);
      if (Character.toUpperCase(choice) == 'N') {
        operation = getOperation();
      }
    } else {
      System.out.println("Error! Try again!");
      in.next();
      operation = getOperation();
    }
    return operation;
  }

  public static String calculate(double number1, double number2, char operation)
      throws IOException {
    String line = new String();
    double result;
    switch (operation) {
      case '+':
        result = number1 + number2;
        line = String.format("%.1f + %.1f = %.1f", number1, number2, result);
        break;
      case '-':
        result = number1 - number2;
        line = String.format("%.1f - %.1f = %.1f", number1, number2, result);
        break;
      case '*':
        result = number1 * number2;
        line = String.format("%.1f * %.1f = %.1f", number1, number2, result);
        break;
      case '/':
        if (number2 == 0) {
          line = "You can’t divide into zero!";
        } else {
          result = number1 / number2;
          line = String.format("%.1f / %.1f = %.1f", number1, number2, result);
        }
        break;
      default:
        System.out.println("There is no such operation");
        calculate(number1, number2, getOperation());
    }
    return line;
  }
}

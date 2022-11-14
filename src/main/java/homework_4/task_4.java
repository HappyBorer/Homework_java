package homework_4;

// Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
// Вычислить запись если это возможно Важно!

import java.util.HashMap;
import java.util.Stack;
import java.util.logging.Logger;

public class task_4 {

  public static HashMap<Character, Integer> operationPriority = new HashMap<>() {{
    put('(', 0);
    put('+', 1);
    put('-', 1);
    put('*', 2);
    put('/', 2);
  }};

  public static void main(String[] args) {
    Logger logger = Logger.getAnonymousLogger();
    String infixNotation = "(9*5+3*2)*(4/2)";
    String postfixNotation = getPostfixNotation(infixNotation);
    logger.info(String.format("%s = %s (%s)", postfixNotation,
        solvePostfixExpression(postfixNotation), infixNotation));
  }

  public static String getPostfixNotation(String infixNotation) {
    String postfixNotation = "";
    Stack<Character> operation = new Stack<>();
    for (int i = 0; i < infixNotation.length(); i++) {
      if (Character.isDigit(infixNotation.charAt(i))) {
        postfixNotation += infixNotation.charAt(i);
      } else if (infixNotation.charAt(i) == '(') {
        operation.push(infixNotation.charAt(i));
      } else if (infixNotation.charAt(i) == ')') {
        while (!operation.empty() && operation.peek() != '(') {
          postfixNotation += " " + operation.pop();
        }
        operation.pop();
      } else {
        while (!operation.empty() && operationPriority.get(operation.peek())
            >= operationPriority.get(infixNotation.charAt(i))) {
          postfixNotation += " " + operation.pop();
        }
        if (infixNotation.charAt(i) != '(') {
          postfixNotation += " ";
        }
        operation.push(infixNotation.charAt(i));
      }
    }

    while (!operation.empty()) {
      postfixNotation += " " + operation.pop();
    }
    return postfixNotation;
  }

  public static String solvePostfixExpression(String postfixNotation) {
    String[] expression = postfixNotation.split(" ");

    double result = 0;
    String str = "";
    Stack<Double> numbers = new Stack<>();
    Stack<Double> copy = new Stack<>();
    for (int i = 0; i < expression.length; i++) {
      if (isNumeric(expression[i])) {
        numbers.push(Double.parseDouble(expression[i]));
      } else {
        double number2 = numbers.pop();
        double number1 = numbers.pop();
        switch (expression[i]) {
          case "+":
            result = number1 + number2;
            break;
          case "-":
            result = number1 - number2;
            break;
          case "*":
            result = number1 * number2;
            break;
          case "/":
            if (number2 == 0) {
              return "Expression cannot be solved";
            } else {
              result = number1 / number2;
            }
            break;
          default:
            return "Expression cannot be solved";
        }
        numbers.push(result);
      }
    }
    str = String.valueOf(numbers.pop());
    return str;
  }

  public static boolean isNumeric(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}

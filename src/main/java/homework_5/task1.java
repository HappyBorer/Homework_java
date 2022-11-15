package homework_5;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class task_1 {

  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    Logger logger = Logger.getAnonymousLogger();
    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
    boolean flag = true;
    int choice;

    while (flag) {
      choice = getAnswerMenu();

      if (choice == 1) {
        System.out.println("Enter the contact's name");
        String name = in.next();
        System.out.println("Enter the contact number");
        String number = in.next();
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>());
        phoneBook.get(name).add(number);
      } else if (choice == 2) {
        if (phoneBook.isEmpty()) {
          logger.info("No contacts!");
        } else {
          for (String contact : phoneBook.keySet()) {
            logger.info(String.format("%s  %s\n", contact, phoneBook.get(contact)));
          }
        }
      } else if (choice == 3) {
        System.out.print("Go out, exit?(Y/N): ");
        char answer = in.next().charAt(0);
        if (Character.toUpperCase(answer) == 'Y') {
          flag = false;
        }
      } else {
        System.out.println("There is no such point! Try again!");
      }
    }


  }

  public static int getAnswerMenu() {
    System.out.println("1.Add contact or number");
    System.out.println("2.Show phone book");
    System.out.println("3.Exit");
    return in.nextInt();
  }
}

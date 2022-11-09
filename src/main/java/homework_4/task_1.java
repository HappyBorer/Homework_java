package homework_4;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.logging.Logger;

public class task_1 {
  public static void main(String[] args){
    LinkedList<String> words = new LinkedList<>();
    words.add("Sport");
    words.add("Life");
    words.add("Power");
    words.add("Happy");

    Logger logger = Logger.getAnonymousLogger();
    logger.info(words.toString());

    words = ternOver(words);
    logger.info(words.toString());
  }

  public static LinkedList<String> ternOver(LinkedList<String> list){
    for (int i = list.size()-1; i >= list.size()/2 ; i--) {
      String temperElement = list.get(i);
      list.set(i, list.get(list.size()-1-i));
      list.set(list.size()-1-i, temperElement);
    }
    return list;
  }

}

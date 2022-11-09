package homework_4;

// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает
// элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет
// его, first() - возвращает первый элемент из очереди, не удаляя.


import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Logger;

public class task_2 {

  public static void main(String[] args) {
    Logger logger = Logger.getAnonymousLogger();
    LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(2, 3, 53, 12, 36, 1, 44));
    logger.info(numbers.toString());

    enqueue(numbers, 777);
    logger.info(numbers.toString());

    logger.info(Integer.toString(dequeue(numbers)));
    logger.info(numbers.toString());
    
    logger.info(Integer.toString(first(numbers)));
    logger.info(numbers.toString());

  }

  public static void enqueue(LinkedList<Integer> list, int element){
    list.add(element);
  }

  public static int dequeue(LinkedList<Integer> list){
    int element = list.getFirst();
    list.removeFirst();
    return element;
  }

  public  static int first(LinkedList<Integer> list){
    return list.getFirst();
  }

}

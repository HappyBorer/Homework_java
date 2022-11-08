package homework_3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class task_2 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        Logger logger = Logger.getAnonymousLogger();

        Random random = new Random();

        int numElement = 20;

        for (int i = 0; i < numElement; i++) {
            numbers.add(random.nextInt(20)-5);
        }

        logger.info(numbers.toString());

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2 == 0){
                numbers.remove(i);
                --i;
            }
        }

        logger.info(numbers.toString());

    }
}

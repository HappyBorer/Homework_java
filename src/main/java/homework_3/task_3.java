package homework_3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class task_3 {
    public static void main(String[] args){
        Logger logger = Logger.getAnonymousLogger();
        ArrayList<Integer> numbersInt = new ArrayList<>(Arrays.asList(6, 5, 4, 564, 23, 56, 98, 15, 986));
        logger.info(numbersInt.toString());
        Collections.sort(numbersInt);
        int min = numbersInt.get(0);
        int max = numbersInt.get(numbersInt.size()-1);
        int middle;
        if(numbersInt.size() % 2 != 0){
            middle = numbersInt.get(numbersInt.size()/2+1);
        }else{
            middle = numbersInt.get(numbersInt.size()/2);
        }
        
        logger.info(String.format("Минимальное число из списка - %d", min));
        logger.info(String.format("Максимальное число из списка - %d", max));
        logger.info(String.format("Среднее число из списка - %d", middle));

    }
}

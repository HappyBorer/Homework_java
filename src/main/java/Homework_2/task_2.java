package Homework_2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class task_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_2.class.getName());
        FileHandler log = new FileHandler("log.txt", true);
        logger.addHandler(log);

        SimpleFormatter sFormat = new SimpleFormatter();
        log.setFormatter(sFormat);
        int[] numbers = {5, 63, 2, 70, 4, 1, 0, 6, 25, 15};

        for(int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length-1-i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
            logger.info(printIntArray(numbers));
        }
    }

    public static String printIntArray(int[] arr) throws IOException{
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]).append(" ");

            if(i == arr.length -1){
                str.append("\n");
            }
        }
        return str.toString();
    }
}

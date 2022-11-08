package homework_3;
// Реализовать алгоритм сортировки слиянием



import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class task_1 {
    public static void main(String[] args){
        Logger logger = Logger.getAnonymousLogger();

        int[] numbers = new int[20];

        Random number = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number.nextInt(30) - 10;
        }
        logger.info(Arrays.toString(numbers));
        logger.info(Arrays.toString(sortMerge(numbers)));

    }
    public static int[] sortMerge(int[] array){
        if(array == null){
            return null;
        }
        int size = 1;
        int[] current = array;
        int[] merging = new int[array.length];
        int[] tmpArray;

        while(size < array.length){
            for(int i = 0; i < array.length; i += 2 * size){
                merge(current, i, current, i+size, merging, i, size);
            }
            tmpArray = current;
            current = merging;
            merging = tmpArray;
            size *= 2;
        }
        return current;
    }

    public static void merge(int[] arrayFirst, int posStartFirst, int[] arraySecond, int posStartSecond,
                             int[] resultArray, int posStartResult, int size){
        int indexFirst = posStartFirst;
        int indexSecond = posStartSecond;

        int posEndFirst = Math.min(posStartFirst + size, arrayFirst.length);
        int posEndSecond = Math.min(posStartSecond + size, arraySecond.length);

        int  iterations = posEndFirst - posStartFirst + posEndSecond - posStartSecond;
        for (int i = posStartResult; i < posStartResult + iterations; i++) {
            if(indexFirst < posEndFirst && (indexSecond >= posEndSecond
                    || arrayFirst[indexFirst] < arraySecond[indexSecond])){
                resultArray[i] = arrayFirst[indexFirst];
                ++indexFirst;
            }else{
                resultArray[i] = arraySecond[indexSecond];
                ++indexSecond;
            }

        }
    }
}

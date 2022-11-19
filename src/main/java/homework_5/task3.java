package homework_5;

//Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.Arrays;
import java.util.Random;

public class task3 {

  public static void main(String[] args) {
    int size = 14;
    int[] numbersInt = new int[size];
    Random number = new Random();
    for (int i = 0; i < numbersInt.length; i++) {
      numbersInt[i] = number.nextInt(100);
    }
    System.out.println(Arrays.toString(numbersInt));

    heapSort(numbersInt);

    System.out.println(Arrays.toString(numbersInt));
  }

  private static void heapSort(int[] arr) {
    for(int i = arr.length/2-1; i >= 0 ; i--){
      heapify(arr, i, arr.length);
    }

    for (int i = arr.length - 1; i >= 0 ; i--) {
      int tmp = arr[0];
      arr[0] = arr[i];
      arr[i] = tmp;

      heapify(arr, 0, i);
    }
  }

  private static void heapify(int[] arr, int i, int length) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int largest = i;

    if (left < length && arr[left] > arr[largest]){
      largest = left;
    }
    if (right < length && arr[right] > arr[largest]){
      largest = right;
    }

    if(i != largest){
      int tmp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = tmp;

      heapify(arr, largest, length);
    }
  }

}

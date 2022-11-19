package homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;


// Пусть дан список сотрудников:
// Написать программу, которая найдет и выведет повторяющиеся имена
// с количеством повторений. Отсортировать по убыванию популярности.
public class task2 {

  public static void main(String[] args) {
    ArrayList<String> employees = new ArrayList<>(Arrays.asList(
      "Иван Иванов",
      "Светлана Петрова",
      "Кристина Белова",
      "Анна Мусина",
      "Анна Крутова",
      "Иван Юрин",
      "Петр Лыков",
      "Павел Чернов",
      "Петр Чернышов",
      "Мария Федорова",
      "Марина Светлова",
      "Мария Савина",
      "Мария Рыкова",
      "Марина Лугова",
      "Анна Владимирова",
      "Иван Мечников",
      "Петр Петин",
      "Иван Ежов"
    ));
    getRepeatingNames(employees);

  }

  public static void getRepeatingNames(ArrayList<String> workers){
    TreeMap<Integer,ArrayList<String>> repeatingName = new TreeMap<>();
    int count;
    for(int i = 0; i < workers.size()-1; i++){
      count = 1;
      String[] name = workers.get(i).split(" ");
      for (int j = i+1; j < workers.size(); j++) {
        String[] nameNext = workers.get(j).split(" ");
        if (name[0].equals(nameNext[0])){
          count++;
          workers.remove(j);
          j--;
        }
      }

      if (count > 1) {
        if (!repeatingName.containsKey(count)) {
          repeatingName.put(count, new ArrayList<>());
        }
        repeatingName.get(count).add(name[0]);
        Collections.sort(repeatingName.get(count));
      }

    }
    for(Integer amount : repeatingName.descendingMap().keySet()){
      for(int i = 0; i < repeatingName.get(amount).size(); i++){
        System.out.printf("%s - %d\n", repeatingName.get(amount).get(i), amount);
      }
    }

  }
}

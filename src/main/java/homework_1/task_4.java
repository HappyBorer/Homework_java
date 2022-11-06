package homework_1;

//Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например
//2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или
//сообщить, что его нет.


import java.util.ArrayList;
import java.util.List;

public class task_4 {
    public static String SearchSolution(int size, String exp, List ind){
        String line = "The equation cannot be restored";
        if (size == 0) {
            return exp;
        }else {
            for (int i = 0; i < 10; i++) {
                char[] tmp = exp.toCharArray();
                tmp[(Integer) ind.get(size - 1)] = Character.forDigit(i, 10);
                exp = String.valueOf(tmp);
                exp = SearchSolution(size - 1, exp, ind);
                String[] tmpr = exp.split(" [\\+=] ");
                if (Integer.parseInt(tmpr[0]) + Integer.parseInt(tmpr[1]) == Integer.parseInt(tmpr[2])){
                    line = exp;
                    break;
                }
            }
        }

        if (ind.size() == size){
            return line;
        }else{
            return exp;
        }

    }
    public static void main(String[] args){
        String equation = "?2? + ?5? = 6??";
        List index = new ArrayList();
        for (int i = 0; i < equation.length(); i++) {
           if(equation.charAt(i) == '?'){
               index.add(i);
           }
        }
        int size = index.size();
        System.out.printf("Restored equality - %s\n",SearchSolution(size, equation, index));
    }
}

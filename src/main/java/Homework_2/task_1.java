package Homework_2;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//  Написать метод(ы), который распарсит json и, используя StringBuilder,
//  создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//  Пример вывода:
//  Студент Иванов получил 5 по предмету Математика.
//  Студент Петрова получил 4 по предмету Информатика.
//  Студент Краснов получил 5 по предмету Физика.

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Map<String, String> person = new LinkedHashMap<>();
        person.put("name", "Ivanov");
        person.put("country", "Russia");
        person.put("city", "Moscow");
        person.put("age",null);


        List<Map<String, String>> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Map<String, String> student = new LinkedHashMap<>();

            Scanner input = new Scanner(System.in);

            System.out.printf("Введите фамилию %d студента: ", i+1);
            String lastName = input.next();
            student.put("фамилия", lastName);

            System.out.print("Введите оценку: ");
            String grade = input.next();
            student.put("оценка", grade);

            System.out.print("Введите предмет: ");
            String subject = input.next();
            student.put("предмет", subject);
            students.add(student);

        }

        System.out.println(getQuery(person));

        getQuery2(students);

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;
            result.append(pair.getKey());
            result.append(" : '");
            result.append(pair.getValue());
            result.append("', ");
        }

        result.delete(result.length() - 2, result.length());

        return result.toString();
    }

    public static void getQuery2(List<Map<String, String>> params) {

        for (Map<String, String> param : params) {
            StringBuilder result = new StringBuilder();

            result.append("Студент ");
            result.append(param.get("фамилия"));

            result.append(" получил ");
            result.append(param.get("оценка"));

            result.append(" по предмету ");
            result.append(param.get("предмет")).append(".");

            System.out.println(result);
        }

    }
}

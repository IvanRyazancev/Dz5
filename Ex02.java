import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        /*
            Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
        Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
        Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
            Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */
        Map<String, Integer> namePeople = new HashMap<>();
        String[] staff = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыковский",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Мария Федоровченко",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов",
                "Иван Ежов",
                "Иван Ежов",
                "Иван Ежов"
        };
        countName(staff, namePeople);
        sortedStaff(namePeople);
    }

    // Функция, считающая кол-во повторений имен сотрудников
    public static void countName(String[] people, Map<String, Integer> namePeople) {
        for (String person : people) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
        System.out.println(namePeople);
    }

    public static void sortedStaff(Map<String, Integer> namePeople) {
        Map<String, Integer> sortedName = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedName.putAll(namePeople);
        System.out.println(sortedName);
    }
}


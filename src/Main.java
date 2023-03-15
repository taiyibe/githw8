import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new PersonComparator(4));
        System.out.println("Сортированный Set:");
        set.add(new Person("Карлсон", "Бах Соломон Богомолов", 38));
        set.add(new Person("Эммануэль", "Яблочкин Пестровцев", 89));
        set.add(new Person("Алехандро", "Де Виктор Комета Даром", 62));
        set.add(new Person("Сюзерен", "Солнцев Пауков Соловей", 40));
        set.add(new Person("Олег", "Лекс Большой Рамзес Ахметович Первый", 16));

        for (Person person : set) {
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d\n", person.getName(), person.getSurname(), person.getAge());
        }

        Map<Person, Integer> map = new TreeMap<>(new PersonComparator(3));
        System.out.println("\nСортированный Map:");
        map.put(new Person("Карлсон", "Бах Соломон Богомолов", 38), 0);
        map.put(new Person("Эммануэль", "Яблочкин Пестровцев", 89), 1);
        map.put(new Person("Алехандро", "Де Виктор Комета Даром", 62), 2);
        map.put(new Person("Сюзерен", "Солнцев Пауков Соловей", 40), 3);
        map.put(new Person("Олег", "Лекс Большой Рамзес Ахметович Первый", 16), 4);

        for (Person person : map.keySet()) {
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d, ID: %d\n", person.getName(), person.getSurname(), person.getAge(), map.get(person));
        }
    }
}
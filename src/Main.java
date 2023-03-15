import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new PersonComparator());
        System.out.println("Сортированный Set:");
        set.add(new Person("Карлсон", "Бах Соломон Богомолов", 38));
        set.add(new Person("Эммануэль", "Яблочкин Пестров", 89));
        set.add(new Person("Алехандро", "Де Виктор Комета Даром", 62));
        set.add(new Person("Сюзерен", "Солнцев Пауков Соловей", 40));

        for (Person person : set) {
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d\n", person.getName(), person.getSurname(), person.getAge());
        }

        Map<Person, Integer> map = new TreeMap<>(new PersonComparator());
        System.out.println("\nСортированный Map:");
        map.put(new Person("Карлсон", "Бах Соломон Богомолов", 38), 0);
        map.put(new Person("Эммануэль", "Яблочкин Пестров", 89), 1);
        map.put(new Person("Алехандро", "Де Виктор Комета Даром", 62), 2);
        map.put(new Person("Сюзерен", "Солнцев Пауков Соловей", 40), 3);

        for (Person person : map.keySet()) {
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d, ID: %d\n", person.getName(), person.getSurname(), person.getAge(), map.get(person));
        }
    }
}
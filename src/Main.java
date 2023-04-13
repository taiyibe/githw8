import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(((Person o1, Person o2)->{
            String[] s1 = o1.getSurname().split(" ");
            String[] s2 = o2.getSurname().split(" ");
            int w1 = 0;
            int w2 = 0;
            int MaxWords = 4;
            for (String s : s1) {
                w1 += s.split("-").length;
            }

            for (String s : s2) {
                w2 += s.split("-").length;
            }
            if (w1 < MaxWords || w2 < MaxWords) {
                if (w1 < w2) {
                    return 1;
                } else if (w1 > w2) {
                    return -1;
                } else {
                    if (o1.getAge() < o2.getAge()) {
                        return 1;
                    } else if (o1.getAge() > o2.getAge()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            } else {
                if (o1.getAge() < o2.getAge()) {
                    return 1;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }));
        System.out.println("Сортированный Set:");
        set.add(new Person("Карлсон", "Бах-Соломон Богомолов", 38));
        set.add(new Person("Эммануэль", "Яблочкин Пестровцев", 89));
        set.add(new Person("Алехандро", "Де-Виктор-Комета-Даром", 62));
        set.add(new Person("Сюзерен", "Солнцев Пауков Соловей", 40));
        set.add(new Person("Олег", "Лекс Большой Рамзес Ахметович Первый", 16));

        for (Person person : set) {
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d\n", person.getName(), person.getSurname(), person.getAge());
        }

        Map<Person, Integer> map = new TreeMap<>(((Person o1, Person o2)->{
            String[] s1 = o1.getSurname().split(" ");
            String[] s2 = o2.getSurname().split(" ");
            int w1 = 0;
            int w2 = 0;
            int MaxWords = 4;
            for (String s : s1) {
                w1 += s.split("-").length;
            }

            for (String s : s2) {
                w2 += s.split("-").length;
            }
            if (w1 < MaxWords || w2 < MaxWords) {
                if (w1 < w2) {
                    return 1;
                } else if (w1 > w2) {
                    return -1;
                } else {
                    if (o1.getAge() < o2.getAge()) {
                        return 1;
                    } else if (o1.getAge() > o2.getAge()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            } else {
                if (o1.getAge() < o2.getAge()) {
                    return 1;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }));
        System.out.println("\nСортированный Map:");
        map.put(new Person("Карлсон", "Бах-Соломон Богомолов", 38), 0);
        map.put(new Person("Эммануэль", "Яблочкин Пестровцев", 89), 1);
        map.put(new Person("Алехандро", "Де-Виктор-Комета-Даром", 62), 2);
        map.put(new Person("Сюзерен", "Солнцев Пауков Соловей", 40), 3);
        map.put(new Person("Олег", "Лекс Большой Рамзес Ахметович Первый", 16), 4);

        for (Person person : map.keySet()) {
            System.out.printf("Имя: %s, Фамилия: %s, Возраст: %d, ID: %d\n", person.getName(), person.getSurname(), person.getAge(), map.get(person));
        }
    }
}
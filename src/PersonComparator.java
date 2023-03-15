import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int w1 = o1.getSurname().split(" ").length;
        int w2 = o2.getSurname().split(" ").length;
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
    }

}
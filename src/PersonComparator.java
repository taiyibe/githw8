import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int MaxWords;

    public PersonComparator(int maxWrd) {
        MaxWords = maxWrd;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] s1 = o1.getSurname().split(" ");
        String[] s2 = o2.getSurname().split(" ");
        int w1 = 0;
        int w2 = 0;
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
    }
}

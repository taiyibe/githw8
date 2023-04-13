public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String n, String s, int a) {
        name = n;
        surname = s;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String val) {
        name = val;
    }

    public void setSurname(String val) {
        surname = val;
    }

    public void setName(int val) {
        age = val;
    }

    public String toString() {
        return name + " " + surname + " Возраст: " + Integer.toString(age);
    }
}
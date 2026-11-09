package comparable;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Cat cat) {
        return this.name.compareTo(cat.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

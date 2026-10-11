package campsystem;

public abstract class Dog {

    private final String id;
    private String name;
    private int age;
    private PlayArea currentPlayArea;

    public Dog(String id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be strictly positive");
        }
        this.age = age;
    }

    public PlayArea getCurrentPlayArea() {
        return currentPlayArea;
    }

    public void assignToPlayArea(PlayArea area) {
        this.currentPlayArea = area;
    }
}

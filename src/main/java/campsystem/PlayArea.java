package campsystem;

import java.util.ArrayList;
import java.util.List;

public class PlayArea {

    private final String name;
    private final int capacity;
    private final List<Dog> dogs = new ArrayList<>();

    public PlayArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addDog(Dog dog) {
        if (isFull()) {
            throw new IllegalStateException("PlayArea is at full capacity");
        }
        dogs.add(dog);
        dog.assignToPlayArea(this);
    }

    public void removeDog(Dog dog) {
        dogs.remove(dog);
        dog.assignToPlayArea(null);
    }

    public boolean isFull() {
        return dogs.size() >= capacity;
    }
}

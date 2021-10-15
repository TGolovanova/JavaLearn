import animals.Animal;
import animals.AviarySizeType;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private final Map<String, T> animals;
    private final AviarySizeType type;

    public Aviary(AviarySizeType type) {
        this.type = type;
        this.animals = new HashMap<>();
    }

    public void addAnimal(T animal) {
        if (animal.getSizeType().equals(type)) {
            animals.put(animal.getName(), animal);
        } else {
            throw new IllegalArgumentException("Animal " + animal.getName() + " is not appropriate for this aviary");
        }
    }

    public T getAnimal(String name) {
        return animals.get(name);
    }

    public void deleteAnimal(String name) {
        animals.remove(name);
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "animals=" + animals +
                '}';
    }
}

package animals;

import skills.Run;
import skills.Voice;

public class Camel extends Herbivore implements Run, Voice {

    public Camel(String name) {
        super(name, AviarySizeType.BIG);
    }

    @Override
    public String voice() {
        return "Urrr";
    }

    @Override
    public void run() {
        System.out.println("I`m running");
    }

    @Override
    public String toString() {
        return String.format("Camel(%s)", getName());
    }
}

package animals;

import skills.Run;
import skills.Voice;

public class Giraffe extends Herbivore implements Run, Voice {
    public Giraffe(String name) {
        super(name, AviarySizeType.BIG);
    }

    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "Ииииу";
    }

    @Override
    public String toString() {
        return String.format("Giraffe(%s)", getName());
    }
}

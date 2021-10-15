package animals;

import skills.Run;
import skills.Voice;

public class Wolf extends Carnivorous implements Run, Voice {
    public Wolf(String name) {
        super(name, AviarySizeType.MEDIUM);
    }

    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "ауф";
    }

    @Override
    public String toString() {
        return String.format("Wolf(%s)", getName());
    }
}

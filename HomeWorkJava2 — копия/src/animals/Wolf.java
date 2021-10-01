package animals;

import skills.Run;
import skills.Voice;

public class Wolf extends Carnivorous implements Run, Voice {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "ауф";
    }
}

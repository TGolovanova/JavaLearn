package animals;

import skills.Run;
import skills.Voice;

public class Giraffe extends Herbivore implements Run, Voice {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "Ииииу";
    }

}

package animals;

import skills.Run;
import skills.Voice;

public class Camel extends Herbivore implements Run, Voice {

    @Override
    public String voice() {
        return "Urrr";
    }

    @Override
    public void run() {
        System.out.println("I`m running");
    }

}

package animals;

import skills.Run;
import skills.Swim;
import skills.Voice;

public class Tiger extends Carnivorous implements Run, Voice, Swim {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "ррррр";
    }

    @Override
    public void swim() {
        System.out.println("I'm tiger, i'm swimming");
    }
}

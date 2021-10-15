package animals;

import skills.Run;
import skills.Swim;
import skills.Voice;

public class Tiger extends Carnivorous implements Run, Voice, Swim {
    public Tiger(String name) {
        super(name, AviarySizeType.MEDIUM);
    }

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

    @Override
    public String toString() {
        return String.format("Tiger(%s)", getName());
    }
}

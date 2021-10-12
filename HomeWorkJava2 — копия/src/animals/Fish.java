package animals;

import skills.Swim;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void swim() {
        System.out.println("I'm fish, i'm swimming");
    }
}

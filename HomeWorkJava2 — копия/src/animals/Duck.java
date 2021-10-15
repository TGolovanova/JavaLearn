package animals;

import skills.Fly;
import skills.Run;
import skills.Swim;
import skills.Voice;

public class Duck extends Herbivore implements Fly, Voice, Swim, Run {

    public Duck(String name) {
        super(name, AviarySizeType.SMALL);
    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {
        System.out.println("I'm duck, i'm swimming");
    }

    @Override
    public String voice() {
        return "кря-кря";
    }

    @Override
    public String toString() {
        return String.format("Duck(%s)", getName());
    }
}

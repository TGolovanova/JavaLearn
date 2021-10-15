package animals;

import skills.Swim;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name, AviarySizeType.VERY_SMALL);
    }

    @Override
    public void swim() {
        System.out.println("I'm fish, i'm swimming");
    }

    @Override
    public String toString() {
        return String.format("Fish{%s}", getName());
    }
}

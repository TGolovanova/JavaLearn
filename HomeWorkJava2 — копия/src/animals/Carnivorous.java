package animals;

import food.Food;
import food.Grass;

public abstract class Carnivorous extends Animal{

    public void eat(Food food) {
        if (food instanceof Grass)
            System.out.println("Я не ем траву");
        else
            System.out.println("Я покушал");
    }
}

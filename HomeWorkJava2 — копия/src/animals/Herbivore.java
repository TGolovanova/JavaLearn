package animals;

import food.Food;
import food.Meat;

public abstract class Herbivore extends Animal{

    public void eat(Food food) {
        if (food instanceof Meat)
            System.out.println("Я не ем мясо");
        else
            System.out.println("Я покушал");
    }
}

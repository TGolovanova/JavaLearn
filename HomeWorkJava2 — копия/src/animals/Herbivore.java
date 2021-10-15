package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, AviarySizeType sizeType) {
        super(name, sizeType);
    }

    public void eat(Food food) {
        if (food instanceof Meat)
            throw new WrongFoodException("Я не ем мясо!");
        else
            System.out.println("Я покушал");
    }
}

package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name, AviarySizeType sizeType) {
        super(name, sizeType);
    }

    public void eat(Food food) {
        if (food instanceof Grass)
            throw new WrongFoodException("Я не ем траву!");
        else
            System.out.println("Я покушал");
    }
}

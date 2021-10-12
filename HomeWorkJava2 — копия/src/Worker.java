import animals.Animal;
import skills.Voice;
import food.Food;

public class Worker {

    public void feed(Food food, Animal animal) {
        animal.eat(food);
    }

    public String getVoice(Voice animalWithVoice) {

            return animalWithVoice.voice();
    }
}

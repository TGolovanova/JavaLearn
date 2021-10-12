import animals.*;
import food.Grass;
import food.Meat;
import skills.Swim;

public class Zoo {
    public static void main(String[] args) {

        Camel camel = new Camel();
        Duck duck = new Duck();
        Giraffe giraffe = new Giraffe();

        Fish fish = new Fish();
        Tiger tiger = new Tiger();
        Wolf wolf = new Wolf();

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker = new Worker();

        Swim[] pool = {fish, duck, tiger};
        for (Swim swimmer : pool) {
            swimmer.swim();
        }

        worker.feed(meat, giraffe);
        worker.feed(grass, giraffe);
        worker.feed(meat, tiger);
        worker.feed(grass, tiger);
        System.out.println(worker.getVoice(duck));
        System.out.println(worker.getVoice(wolf));

    }
}

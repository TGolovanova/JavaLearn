import animals.*;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        showAviaryMethods();
        System.out.println();
        showAviaryRestriction();
        System.out.println();
        showBadFood();
    }

    public static void showBadFood() {
        try {
            Herbivore donaldCamel = new Camel("Donald");
            donaldCamel.eat(new Meat());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showAviaryRestriction() {
        try {
            Herbivore tomme = new Duck("Tomme");

            // Вольер для больших травоядных животных
            Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySizeType.BIG);

            herbivoreAviary.addAnimal(tomme);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showAviaryMethods() {
        Herbivore donaldCamel = new Camel("Donald");
        Herbivore lexaGiraffe = new Giraffe("Lexa");

        // Вольер для больших травоядных
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySizeType.BIG);

        // Добавление 2х травоядных больших животных
        herbivoreAviary.addAnimal(donaldCamel);
        herbivoreAviary.addAnimal(lexaGiraffe);

        // Распечатаем кто в вольере
        System.out.println("Содержимое вольера " + herbivoreAviary);

        // Получение Жирафа по имени Леха
        System.out.println("Получение животного по имени Lexa: " + herbivoreAviary.getAnimal("Lexa"));

        // Удаление жирафа по имени Леха
        herbivoreAviary.deleteAnimal("Lexa");

        // Распечатаем кто в вольере
        System.out.println("Содержимое вольера " + herbivoreAviary);
    }
}

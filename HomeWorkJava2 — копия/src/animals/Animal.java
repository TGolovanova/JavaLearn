package animals;

import food.Food;

public abstract class Animal {
   private final String name;
   private final AviarySizeType sizeType;

   public Animal(String name, AviarySizeType sizeType) {
      this.name = name;
      this.sizeType = sizeType;
   }

   public String getName() {
      return name;
   }

   public AviarySizeType getSizeType() {
      return sizeType;
   }

   public abstract void eat(Food food);
}

package model;

import java.util.Random;

public class Kotik {
    private static int kotikCount;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private int saturation;
    private String meal;

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        kotikCount++;
    }

    public Kotik() {
        kotikCount++;
    }

    public static int getKotikCount() {
        return kotikCount;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public int getSaturation() {
        return saturation;
    }

    public String getMeal() {
        return meal;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public boolean play() {
        if (saturation > 0) {
            saturation--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean chaseMouse() {
        if (saturation > 0) {
            saturation--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean sleep() {
        if (saturation > 0) {
            saturation--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean voice() {
        if (saturation > 0) {
            saturation--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public boolean makeFun() {
        if (saturation > 0) {
            saturation--;
            return true;
        } else {
            eat();
            return false;
        }
    }

    public void eat(int saturation) {
        this.saturation += saturation;
    }

    public void eat(int saturation, String meal) {
        this.saturation += saturation;
        this.meal = meal;
    }

    public void eat() {
        eat(5, "Вискас");
    }

    public void liveAnotherDay() {
        Random random = new Random();
        for (int i = 1; i <= 24; i++) {
            int variant = random.nextInt(5);
            switch (variant) {
                case 0:
                    if (makeFun())
                        System.out.println("Я веселюсь");
                    else
                        System.out.println("Не буду веселиться, я хочу кушать");
                    break;
                case 1:
                    if (sleep())
                        System.out.println("Я сплю");
                    else
                        System.out.println("Не буду спать, я хочу кушать");
                    break;
                case 2:
                    if (voice())
                        System.out.println("Я мяукаю");
                    else
                        System.out.println("Не буду мяукать, я хочу кушать");
                    break;
                case 3:
                    if (play())
                        System.out.println("Я играю");
                    else
                        System.out.println("Не буду веселиться, я хочу кушать");
                    break;
                case 4:
                    if (chaseMouse())
                        System.out.println("Я ловлю мышь");
                    else
                        System.out.println("Не буду ловить мышей, я хочу кушать");
                    break;
            }
        }
    }
}

import model.Kotik;

public class Application {

    public static void main(String[] args) {

        Kotik kotik1 = new Kotik(9, "Колян", 10, "мав");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(10, "Барсик", 7, "мяу");

        kotik2.liveAnotherDay();

        System.out.println("Имя: " + kotik2.getName() + ", \nВес: " + kotik2.getWeight());
        System.out.println("Совпадение голосов: " + kotik1.getMeow().equals(kotik2.getMeow()));
        System.out.println("Количество котиков: " + Kotik.getKotikCount());
    }
}

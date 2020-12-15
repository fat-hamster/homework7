import java.util.Random;
import java.util.Scanner;

public class Main {
    private final String[] names = {"Абама", "Акс", "Бари", "Багс", "Варджак", "Варвар", "Ганс",
        "Гимли", "Джоки", "Деяр-Бекир", "Ексель", "Егерь", "Жбан", "Жан Батист",
        "Зизу", "Зигмунд", "Иларион", "Иржик", "Коврик", "Кенни", "Коржик"};

    public static void main(String[] args) {
        Cat cat = new Cat("Борис");
        Plate plate = new Plate(30);

        Main prog = new Main();
        prog.mainLoop(cat, plate);
    }

    private void mainLoop(Cat cat, Plate plate) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            menu(cat, plate);
            if(sc.hasNextInt()) {
                switch (sc.nextInt()) {
                    case 1:
                        cat.eat(plate);
                        break;
                    case 2:
                        plate.addFood(new Random().nextInt(20) + 20);
                        break;
                    case 3:
                        cat.play();
                        break;
                    case 4:
                        exit = true;
                }
            }
        }while (!exit);

        Cat[] cats = new Cat[10];

        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat(names[new Random().nextInt(21)]);
        }
        Plate plate1 = new Plate(300); // большая тарелка для стада котов

        for (int i = 0; i < 10; i++) {
            cats[i].eat(plate1);
            System.out.println(cats[i]);
        }

        sc.close();
        System.exit(0);
    }

    private void menu(Cat cat, Plate plate) {
        System.out.println(" Menu");
        System.out.println("======");
        System.out.println(cat);
        System.out.println(plate);
        System.out.println("Покормить кота: 1");
        System.out.println("Наполнить тарелку: 2");
        System.out.println("Поиграть с котом: 3");
        System.out.println("Выход: 4");
        System.out.print("Пункт меню: ");
    }

}

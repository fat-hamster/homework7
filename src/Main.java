import java.util.Random;
import java.util.Scanner;

public class Main {
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

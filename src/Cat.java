import java.util.Random;

public class Cat {
    private final String name;
    private int hunger;
    private final int SATIETY;


    private boolean alive;
    private int count_live;

    public Cat(String name) {
        this.name = name;
        alive = true;
        hunger = 0;
        count_live = 0;
        SATIETY = new Random().nextInt(10) + 20;
    }

    public void eat(Plate plate) {
        if (rip()) {
            return;
        }
        if(hunger >= SATIETY) {
            System.out.println("Не хочу есть");
            return;
        }
        int food = new Random().nextInt(10) + 5; // котенок еще))
        int result = plate.decFood(food);
        if (result == -1) {
            this.hunger += food;
        } else if (result == 0) {
            if (hunger > 0) {
                hunger -= new Random().nextInt(5) + 3;
            } else {
                hunger = 0;
            }
        } else {
            this.hunger += food - result;
        }
        checkHunger();
    }

    private boolean rip() {
        if (hunger == 0) {
            count_live++;
        }
        if (count_live > 3) {
            alive = false;
        }
        if(!alive) {
            System.out.println("Кот " + name + " умер от голода.");
            System.exit(1);
        }
        return false;
    }

    public void play(){
        if(rip())
        {
            return;
        }
        hunger -= new Random().nextInt(5) + 5;
        checkHunger();
    }

    private void checkHunger() {
        if(hunger < 0) {
            hunger = 0;
        }
    }

    @Override
    public String toString() {
        return "[Cat] " + name + ", hunger " + hunger +
                    ", live " + alive;
    }
}

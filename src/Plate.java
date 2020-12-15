import java.util.Random;

public class Plate {
    private int food;
    private final int MAX_FOOD;

    public Plate(int food) {
        this.food = food;
        MAX_FOOD = new Random().nextInt(30) + 40;
    }

    public void addFood(int food) {
        this.food += food;
        if(this.food > MAX_FOOD) {
            System.out.println("Тарелка полна!");
            this.food = MAX_FOOD;
        }
    }

    public int decFood(int food) {
        if(this.food == 0) {
            return 0;
        }
        int res = this.food - food;
        this.food -= food;
        if(this.food < 0) {
            this.food = 0;
        }
        if(res < 0) {
            return Math.abs(res);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Plate( " +
                "food = " + food +
                ')';
    }
}

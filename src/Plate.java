public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        this.food += food;
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

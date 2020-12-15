public class Plate {
    private int food;

    public void addFood(int food) {
        this.food += food;
    }

    public void decFood(int food) {
        this.food -= food;
        if(this.food < 0) {
            this.food = 0;
        }
    }

    @Override
    public String toString() {
        return "Plate(" +
                "food=" + food +
                ')';
    }
}

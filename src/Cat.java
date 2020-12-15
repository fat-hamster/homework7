import java.util.Date;

public class Cat {
    private final String name;
    private int hunger;
    private boolean live;
    private Date born;

    public Cat(String name) {
        this.name = name;
        live = true;
        hunger = 0;
        born = new Date();
    }

    public void eat() {
        //
    }

    @Override
    public String toString() {
        return "Cat " + name + " born " + born + ", hunger " + hunger +
                ", live " + live;
    }
}

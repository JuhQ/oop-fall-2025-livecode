import java.util.ArrayList;
import java.util.Collections;

class Coffee implements Comparable<Coffee> {

    public final String type;
    private final int temperature;
    private final double cost;

    public Coffee(String type, int temperature, double cost) {
        this.type = type;
        this.temperature = temperature;
        this.cost = cost;
    }

    @Override
    public int compareTo(Coffee coffee) {
        System.out.println("Calling compareTo method");
        return this.temperature - coffee.temperature;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        Coffee cup1 = new Coffee("Dark", 100, 0.70);
        Coffee cup2 = new Coffee("Light", 80, 1.5);

        System.out.println(cup1.compareTo(cup2));

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(cup1);
        coffees.add(cup2);

        // sorts the array list by using the compareTo() method from Coffee class
        Collections.sort(coffees);

        for (Coffee coffee : coffees) {
            System.out.println(coffee.type);
        }
    }
}

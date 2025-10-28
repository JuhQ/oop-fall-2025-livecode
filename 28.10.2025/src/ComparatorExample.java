import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Coffee2 {

    public final String type;
    public final int temperature;
    private final double cost;

    public Coffee2(String type, int temperature, double cost) {
        this.type = type;
        this.temperature = temperature;
        this.cost = cost;
    }
}

class CoffeeComparator implements Comparator<Coffee2> {
    @Override
    public int compare(Coffee2 o1, Coffee2 o2) {
        return o1.temperature - o2.temperature;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        Coffee2 cup1 = new Coffee2("Dark", 100, 0.70);
        Coffee2 cup2 = new Coffee2("Light", 80, 1.5);

        ArrayList<Coffee2> coffees = new ArrayList<>();
        coffees.add(cup1);
        coffees.add(cup2);

        // normal class
        Comparator<Coffee2> coffeeComparator2 = new CoffeeComparator();

        // anonymous inner class
        Comparator<Coffee2> coffeeComparator = new Comparator<Coffee2>() {
            @Override
            public int compare(Coffee2 o1, Coffee2 o2) {
                return o1.temperature - o2.temperature;
            }
        };

        // sorts the array list by using the compareTo() method from Coffee class
        Collections.sort(coffees, coffeeComparator2);

        for (Coffee2 coffee : coffees) {
            System.out.println(coffee.type);
        }
    }
}

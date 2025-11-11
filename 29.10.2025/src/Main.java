import MathUtils.Utils;
import Hello.HelloWorld;

class Counter2 {
    private static int count = 0;

    public Counter2() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Main {

    public static void main(String[] args) {
        /*
        Counter2 c1 = new Counter2();
        System.out.println(c1.count);
        System.out.println(Counter2.getCount());
        System.out.println(Counter2.count);

        Counter2 c2 = new Counter2();
        System.out.println(c2.count);
        //System.out.println(Counter2.count);
        System.out.println();

        System.out.println(c1.count);


         */

        int result = Utils.add(1,2,3);
        System.out.println(result);

        HelloWorld.hello();
    }
}
import java.util.Scanner;

class ContinuousCounter implements Runnable {
    private int counter;

    ContinuousCounter() {
        counter = 1;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(counter++);
                Thread.sleep(1000);  // write one value/second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
    }
}

public class ContinousCounterExample {
    public static void main(String[] args) {
        String   s       = " ";
        Scanner  scanner = new Scanner(System.in);
        Runnable writer  = new ContinuousCounter();
        Thread t         = new Thread();

        t.start();
        Thread t2         = new Thread(writer);
        t2.start();
        Thread t3         = new Thread(writer);
        t3.start();
        Thread t4         = new Thread(writer);
        t4.start();
        while (scanner.nextLine().charAt(0) != 'q');    // wait for the character 'q'
        t.interrupt();
        System.out.println("Program terminated");
    }
}
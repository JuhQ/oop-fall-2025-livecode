public class Main extends Thread {
    private String word;    // what word to print
    private int    delay;   // how long to pause

    public Main(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(word + " ");
                Thread.sleep(delay);    // wait until next time
            }
        } catch (InterruptedException e) {
            return;                     // end this thread
        }
    }

    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();


        System.out.println(cores);

        /*

        new Main("ping", 33).start();   // 1/30 second
        new Main("PONG", 100).start();  // 1/10 second

         */
    }
}
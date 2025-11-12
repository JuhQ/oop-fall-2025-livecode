import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TicketReservation reservation = new TicketReservation(10);

        int customers = 15;

        for (int i = 0; i < customers; i++) {
            // random ticket count
            int random = (int) (Math.random() * 3) + 1;

            Thread customerThread = new Thread(new Customer(random, reservation));

            customerThread.start();
        }
    }
}
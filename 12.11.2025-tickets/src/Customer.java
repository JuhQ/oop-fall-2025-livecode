public class Customer implements Runnable {
    private static int id = 0;

    private final int tickets;
    private final TicketReservation reserve;
    private final int customerId;

    public Customer(int tickets, TicketReservation reserve) {
        this.tickets = tickets;
        this.reserve = reserve;
        id++;
        this.customerId = id;
    }

    public void run() {
        this.reserve.reserveTicket(this.customerId, this.tickets);
    }

}

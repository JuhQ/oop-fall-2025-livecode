public class TicketReservation {
    private int reservedTickets = 0;
    private int maxTickets;

    public TicketReservation(int maxTickets) {
        this.maxTickets = maxTickets;
    }

    public synchronized boolean reserveTicket(int id, int count) {
        if(this.reservedTickets + count <= this.maxTickets) {

            // simulate heavy load by sleeping 1/10th of a second
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            this.reservedTickets += count;
            System.out.println("Customer " + id + " reserved " + count + " tickets.");
            return true;
        }
        System.out.println("Customer " + id + " couldn't reserved " + count + " tickets.");

        return false;
    }
}

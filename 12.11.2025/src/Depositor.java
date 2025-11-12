import java.math.BigInteger;

// Depositor is our worker here
class Depositor implements Runnable {
    private Account account;
    private int     n;

    public Depositor(Account account, int n) {
        this.account = account;
        this.n       = n;
    }

    public void run() {

        System.out.println("Balance before: " + account.getSaldo());
        for (int i = 0; i < n; i++) {
            account.deposit(BigInteger.ONE);    // we deposit 1 (unit of money)
        }


        System.out.println("Balance after: " + account.getSaldo());

        return;
    }
}
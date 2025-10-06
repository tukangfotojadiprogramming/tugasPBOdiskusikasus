public class CashPayment extends Payment {
    private double cashGiven;

    public CashPayment(String transactionId, double amount, double cashGiven) {
        super(transactionId, amount);
        this.cashGiven = cashGiven;
    }

    @Override
    public void processPayment() {
        double change = cashGiven - amount;
        System.out.println("\n=== Pembayaran Tunai ===");
        System.out.println("Total Belanja : Rp " + amount);
        System.out.println("Dibayar Tunai : Rp " + cashGiven);
        System.out.println("Kembalian     : Rp " + change);
    }
}

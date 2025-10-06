public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("\n=== Pembayaran Kartu Kredit ===");
        System.out.println("ID Transaksi  : " + transactionId);
        System.out.println("Total Belanja : Rp " + amount);
        System.out.println("Nomor Kartu   : " + cardNumber);
        System.out.println("Transaksi berhasil disetujui.");
    }
}

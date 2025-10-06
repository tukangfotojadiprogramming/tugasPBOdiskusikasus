public class EWalletPayment extends Payment implements Refundable {
    private String walletId;
    private double totalRefunded = 0;

    public EWalletPayment(String transactionId, double amount, String walletId) {
        super(transactionId, amount);
        this.walletId = walletId;
    }

    @Override
    public void processPayment() {
        System.out.println("\n=== Pembayaran E-Wallet ===");
        System.out.println("Total Belanja : Rp " + amount);
        System.out.println("ID E-Wallet   : " + walletId);
        System.out.println("Pembayaran sukses melalui E-Wallet.");
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah refund harus lebih dari 0.");
            return;
        }
        double maxRefundable = this.amount - totalRefunded;
        if (maxRefundable <= 0) {
            System.out.println("Refund tidak dapat diproses: total sudah direfund sepenuhnya.");
            return;
        }
        double actual = Math.min(amount, maxRefundable);
        totalRefunded += actual;
        System.out.println("Refund Rp " + actual + " telah dikembalikan ke " + walletId);
        if (amount > actual) {
            System.out.println("Catatan: Rp " + (amount - actual) + " tidak direfund karena melebihi total yang dapat direfund.");
        }
    }

    @Override
    public double getTotalAfterRefund() {
        return amount - totalRefunded;
    }

    @Override
    public void printUpdatedReceipt() {
        System.out.println("\n=== STRUK PEMBAYARAN (Update) ===");
        System.out.println("Total Belanja : Rp " + amount);
        System.out.println("Total Refund  : Rp " + totalRefunded);
        System.out.println("Total Akhir   : Rp " + getTotalAfterRefund());
    }
}

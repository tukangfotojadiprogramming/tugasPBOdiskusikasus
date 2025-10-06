public interface Refundable {
    void refund(double amount);
    double getTotalAfterRefund();
    void printUpdatedReceipt();
}

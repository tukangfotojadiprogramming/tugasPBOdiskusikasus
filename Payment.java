public abstract class Payment {
    protected String transactionId;
    protected double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public abstract void processPayment();
}

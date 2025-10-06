public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PEMBAYARAN ===");

        // Buat daftar barang (otomatis)
        Product[] products = {
            new Product("Indomie Goreng", 3500, 3),
            new Product("Aqua Botol", 5000, 2),
            new Product("Kopi Kapal Api", 2500, 1)
        };

        // Hitung total
        double total = 0;
        for (Product p : products) {
            total += p.getSubtotal();
        }

        // Tampilkan daftar belanja
        System.out.println("\n=== DAFTAR BELANJA ===");
        for (Product p : products) {
            p.showProduct();
        }
        System.out.println("----------------------------");
        System.out.printf("Total Belanja: Rp %.2f\n", total);

        // Pilih metode pembayaran (contoh otomatis pakai E-Wallet)
        Payment payment = new EWalletPayment("TXN001", total, "DANA-0987");

        // Proses pembayaran
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        payment.processPayment();

        if (payment instanceof Refundable) {
            ((Refundable) payment).refund(5000);
            ((Refundable) payment).printUpdatedReceipt();
        }

        System.out.println("\nTerima kasih telah berbelanja");
    }
}

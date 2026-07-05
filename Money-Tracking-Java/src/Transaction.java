public class Transaction {
    // Field
    String type; 
    double amount;
    String description;
    // Method mencetak info
    public void printInfo() {
        System.out.println("Transaksi: " + this.type + " | Rp " + this.amount + " | Info: " + this.description);
    }
}
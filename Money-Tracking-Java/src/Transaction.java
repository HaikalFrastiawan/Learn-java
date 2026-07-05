public class Transaction {
    // Field
    String type; 
    double amount;
    String description;

    // Constructor 1: Kosong
    public Transaction() {
    }

    // Constructor 2: Overloading (Hanya Tipe dan Jumlah)
    public Transaction(String type, double amount) {
        this.type = type; 
        this.amount = amount;
        this.description = "Tanpa Keterangan"; 
    }

    // Constructor 3: Overloading (Lengkap dengan Keterangan)
    public Transaction(String type, double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    // Method mencetak info
    public void printInfo() {
        System.out.println("Transaksi: " + this.type + " | Rp " + this.amount + " | Info: " + this.description);
    }
}
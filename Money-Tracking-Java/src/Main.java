
public class Main {

    public static void main(String[] args) {
        System.out.println("=== TEST MATERI OOP SAMPAI CONSTRUCTOR OVERLOADING ===");

        Transaction trx1 = new Transaction();
        trx1.type = "INCOME";               // <-- Pakai sama dengan (=)
        trx1.amount = 1500000;              // <-- Pakai sama dengan (=)
        trx1.description = "Gaji Bulanan";  // <-- Pakai sama dengan (=)
        trx1.printInfo();

        // Memanggil Constructor 2 (Hanya 2 parameter)
        Transaction trx2 = new Transaction("EXPENSE", 15000);
        trx2.printInfo();

        // Memanggil Constructor 3 (Lengkap 3 parameter)
        Transaction trx3 = new Transaction("EXPENSE", 50000, "Beli Kuota Internet");
        trx3.printInfo();

        System.out.println("\n=== STATUS DATABASE ===");
        // Class DatabaseConfig yang kemarin sudah aman, kita panggil di sini
        DatabaseConfig.getConnection();
    }
}


public class Main {

    public static void main(String[] args) {
       System.out.println("=== UJI COBA MATERI INHERITANCE ===");

        // 1. Membuat objek dari Child Class: IncomeTransaction
        IncomeTransaction pemasukan = new IncomeTransaction();
        // Bukti Inheritance: Kita bisa mengisi field amount & description walaupun tidak tertulis di file IncomeTransaction
        pemasukan.amount = 3500000;
        pemasukan.description = "Proyek kelar";
        pemasukan.source = "Freelance Java"; // Field khusus milik kelas anak
        pemasukan.printIncomeInfo();         // Method khusus milik kelas anak

        System.out.println("------------------------------------");

        // 2. Membuat objek dari Child Class: ExpenseTransaction
        ExpenseTransaction pengeluaran = new ExpenseTransaction();
        pengeluaran.amount = 45000;
        pengeluaran.description = "Makan siang gofood";
        pengeluaran.category = "Makanan & Minuman"; // Field khusus milik kelas anak
        pengeluaran.printExpenseInfo();             // Method khusus milik kelas anak
    }
}

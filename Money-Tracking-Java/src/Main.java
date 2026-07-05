public class Main {
    public static void main(String[] args) {
        System.out.println("=== UJI COBA OVERRIDING & SUPER ===");

        // 1. Mencoba kelas anak: IncomeTransaction
        IncomeTransaction pemasukan = new IncomeTransaction();
        pemasukan.type = "INCOME";
        pemasukan.amount = 5000000;
        pemasukan.description = "Gaji Project Akhir Bulan";
        pemasukan.source = "Client Enterprise";
        
        // Panggil method yang sudah di-override
        pemasukan.printInfo(); 

        System.out.println("------------------------------------");

        // 2. Mencoba kelas anak: ExpenseTransaction
        ExpenseTransaction pengeluaran = new ExpenseTransaction();
        pengeluaran.type = "EXPENSE";
        pengeluaran.amount = 80000;
        pengeluaran.description = "Beli Kopi Korek Api";
        pengeluaran.category = "Kebutuhan Nongkrong";
        
        // Panggil method yang sudah di-override
        pengeluaran.printInfo(); 
    }
}
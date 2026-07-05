public class ExpenseTransaction extends Transaction {
    String category;

    // Menerapkan Method Overriding
    @Override
    public void printInfo() {
        // Memanggil printInfo() milik Parent terlebih dahulu
        super.printInfo(); 
        
        // Menambahkan info spesifik kategori pengeluaran
        System.out.println("--> Kategori: " + category); 
    }
}
public class IncomeTransaction extends Transaction {
    String source; 

    // Menerapkan Method Overriding
    @Override // Dianjurkan ditulis sebagai tanda/annotation kalau ini method overriding
    public void printInfo() {
        // 1. Memanggil perilaku method printInfo() milik Parent Class (Transaction)
        super.printInfo(); 
        
        // 2. Menambahkan perilaku spesifik milik Child Class
        System.out.println("--> Sumber Dana: " + source); 
    }
}
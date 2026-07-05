public class ExpenseTransaction extends Transaction {

    String category;

    public void printExpenseInfo() {
        System.out.println("[EXPENSE] Rp " + amount + " | Ket: " + description + " | Kategori: " + category);
    }
    
}
